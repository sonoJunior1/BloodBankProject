
package BloodBankManagement;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Souleymane.Sono
 */
public class Inventory extends javax.swing.JInternalFrame {

    /**
     * Creates new form Inventory
     */
    private JTable donorTable;
    public Inventory() {
        initComponents();
       
        // Initialize the donor table
        donorTable = new JTable();
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"Blood ID", "Full Name", "Blood Type", "Collection Date", "Collected By", "Expiration Date"},
                0
        );
        donorTable.setModel(model);
        ScrollPane.setViewportView(donorTable);

        // Add action listeners for buttons
        setupBloodTypeButtons();
        checkExpirationDates();

        // Initially populate with all data
        //populateData(null); 
    }
    
    private void promptRemoveExpiredBlood() {
        // Block the application until expired blood is removed
        JOptionPane.showMessageDialog(null, 
            "Some blood is expired or about to expire. You must remove it to continue.", 
            "Action Required", JOptionPane.ERROR_MESSAGE);

        int attempts = 0; // Initialize attempt counter

        while (true) {
            // Allow only 3 attempts before showing a lockout message
            if (attempts >= 3) {
                JOptionPane.showMessageDialog(null, 
                    "Too many failed attempts. You must remove expired blood to proceed.", 
                    "Access Denied", JOptionPane.ERROR_MESSAGE);
                // Reset attempts to enforce continuous re-prompt
                attempts = 0; 
            }

            // Prompt for admin username
            String username = JOptionPane.showInputDialog(null, "Enter admin username:");

            if (username == null || username.isEmpty()) {
                // Keep prompting if the user cancels or leaves the username blank
                JOptionPane.showMessageDialog(null, 
                    "You must provide valid admin credentials to continue.", 
                    "Access Denied", JOptionPane.ERROR_MESSAGE);
                attempts++; // Increment failed attempt
                AppLogger.logWarning("Failed admin login attempt by username: " + username + "Attempt : " + attempts);

                continue; // Go back to the loop
            }

            // Create JPasswordField for password input
            JPasswordField passwordField = new JPasswordField(20); // 20 is the width
            int option = JOptionPane.showConfirmDialog(null, passwordField, "Enter admin password:", 
                                                       JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (option == JOptionPane.OK_OPTION) {
                // Retrieve the entered password
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                if (validateAdminCredentials(username, password)) {
                    // If authentication is successful, remove expired blood
                    removeExpiredBlood();
                    JOptionPane.showMessageDialog(null, 
                        "Expired blood removed successfully.", 
                        "Success", JOptionPane.INFORMATION_MESSAGE);
                    AppLogger.logWarning("Expired blood removed successfully. by" + username);
                    break; // Exit the loop
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "Invalid credentials. Try again.", 
                        "Authentication Failed", JOptionPane.ERROR_MESSAGE);
                    attempts++; // Increment failed attempt
                    AppLogger.logWarning("Invalid credentials. Try again." + username);
                }
            } else {
                // User cancels the password input, increment attempts
                JOptionPane.showMessageDialog(null, 
                    "You must provide valid admin credentials to continue.", 
                    "Access Denied", JOptionPane.ERROR_MESSAGE);
                attempts++; // Increment failed attempt
            }
        }
    }

    
    private boolean validateAdminCredentials(String username, String password) {
        String query = "SELECT password FROM admin WHERE username = ?";

        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, username); // Set the username for the query
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    // Retrieve the stored hashed password from the database
                    String storedHash = rs.getString("password");

                    // Use PasswordUtils.verifyPassword to compare the entered password with the stored hash
                    return PasswordUtils.verifyPassword(password, storedHash);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false; // Return false if no matching username is found or credentials don't match
    }

    
    
    
    private void removeExpiredBlood() {
        String query = "DELETE FROM Inventory WHERE ExpirationDate <= CAST(GETDATE() AS DATE)";

        

        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {

            int rowsDeleted = pstmt.executeUpdate();
            System.out.println(rowsDeleted + " expired blood record(s) removed.");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error removing expired blood: " + ex.getMessage());
            
        }
    }

    

    
   
    private void checkExpirationDates() {
        String query = "SELECT BloodID, ExpirationDate FROM Inventory";

        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Adjust format as needed
            LocalDate today = LocalDate.now();
            boolean hasExpiredBlood = false; // Flag to check if expired blood exists

            while (rs.next()) {
                String bloodID = rs.getString("BloodID");
                String expirationDateStr = rs.getString("ExpirationDate");

                // Parse the expiration date
                LocalDate expirationDate = LocalDate.parse(expirationDateStr, formatter);
                long daysToExpire = ChronoUnit.DAYS.between(today, expirationDate);

                if (daysToExpire == 3) {
                    // Remind user that blood is expiring in 3 days
                    JOptionPane.showMessageDialog(null, 
                        "Blood ID: " + bloodID + " is expiring in 3 days!", 
                        "Warning", JOptionPane.WARNING_MESSAGE);
                } else if (daysToExpire <= 0) {
                    // Mark that expired blood has been found
                    hasExpiredBlood = true;
                    AppLogger.logWarning("Expired blood detected: ID " + bloodID + " at " + today);
                }
            }

            // If expired blood is found, lock the application and prompt for removal
            if (hasExpiredBlood) {
                promptRemoveExpiredBlood();
            }

        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Error checking expiration dates", ex);
            throw new RuntimeException("Error checking expiration dates: " + ex.getMessage());
        }
    }



    
    private void setupBloodTypeButtons() {
        Aplus.addActionListener(e -> populateData("A+"));
        Aminus.addActionListener(e -> populateData("A-"));
        Bplus.addActionListener(e -> populateData("B+"));
        Bminus.addActionListener(e -> populateData("B-"));
        Oplus.addActionListener(e -> populateData("O+"));
        Ominus.addActionListener(e -> populateData("O-"));
        ABplus.addActionListener(e -> populateData("AB+"));
        ABminus.addActionListener(e -> populateData("AB-"));
        ShowAll.addActionListener(e -> retrieveAllData());
    }

    private void retrieveAllData() {
    String query = "SELECT " +
            "CONCAT(i.Firstname, ' ', i.Lastname) AS full_name, " +
            "i.BloodID, " +
            "i.CollectionDate, " +
            "i.collectedBy, " +
            "i.ExpirationDate, " +
            "i.BloodType " +
            "FROM Inventory i";

    
    try (Connection con = getConnection();
         PreparedStatement pstmt = con.prepareStatement(query);
         ResultSet rs = pstmt.executeQuery()) {

        DefaultTableModel tableModel = (DefaultTableModel) donorTable.getModel();
        tableModel.setRowCount(0); // Clear the table before adding rows

        while (rs.next()) {
            String bloodID = rs.getString("BloodID");
            String fullName = rs.getString("full_name");
            String bloodType = rs.getString("BloodType");
            String collectionDate = rs.getString("CollectionDate");
            String collectedBy = rs.getString("collectedBy");
            String expirationDate = rs.getString("ExpirationDate");

            tableModel.addRow(new Object[]{bloodID, fullName, bloodType, collectionDate, collectedBy, expirationDate});
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        throw new RuntimeException("Error retrieving all data: " + ex.getMessage());
    }
}

   
    private void populateData(String bloodTypeFilter) {
        String baseQuery = "SELECT " +
                "CONCAT(i.Firstname, ' ', i.Lastname) AS full_name, " +
                "i.BloodID, " +
                "i.CollectionDate, " +
                "i.collectedBy, " +
                "i.ExpirationDate, " +
                "i.BloodType " +
                "FROM Inventory i";

        // Append filter condition if a blood type is provided
        String query = bloodTypeFilter != null ? baseQuery + " WHERE i.BloodType = ?" : baseQuery;

        

        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {

            // Set the blood type parameter if filtering
            if (bloodTypeFilter != null) {
                pstmt.setString(1, bloodTypeFilter);
            }

            try (ResultSet rs = pstmt.executeQuery()) {
                DefaultTableModel tableModel = (DefaultTableModel) donorTable.getModel();
                tableModel.setRowCount(0); // Clear existing rows

                // Populate the table with rows from the result set
                while (rs.next()) {
                    String bloodID = rs.getString("BloodID");
                    String fullName = rs.getString("full_name");
                    String bloodType = rs.getString("BloodType");
                    String collectionDate = rs.getString("CollectionDate");
                    String collectedBy = rs.getString("collectedBy");
                    String expirationDate = rs.getString("ExpirationDate");

                    tableModel.addRow(new Object[]{bloodID, fullName, bloodType, collectionDate, collectedBy, expirationDate});
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error retrieving data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    private Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://bloodbankdata.database.windows.net:1433;"
                   + "database=bloodBank;"
                   + "user=csiadmin@bloodbankdata;"
                   + "password=7ousRespo3!;"
                   + "encrypt=true;"
                   + "trustServerCertificate=false;"
                   + "hostNameInCertificate=*.database.windows.net;"
                   + "loginTimeout=30;";

        // Establish connection
        return DriverManager.getConnection(url);
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aminus = new javax.swing.JButton();
        ABplus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Bplus = new javax.swing.JButton();
        Oplus = new javax.swing.JButton();
        Aplus = new javax.swing.JButton();
        Ominus = new javax.swing.JButton();
        Bminus = new javax.swing.JButton();
        ABminus = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        ShowAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 0, 51));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Inventory");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Aminus.setBackground(new java.awt.Color(153, 0, 0));
        Aminus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\A-.png")); // NOI18N
        Aminus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Aminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AminusActionPerformed(evt);
            }
        });
        getContentPane().add(Aminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, 130));

        ABplus.setBackground(new java.awt.Color(153, 0, 0));
        ABplus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\AB+.png")); // NOI18N
        ABplus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ABplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABplusActionPerformed(evt);
            }
        });
        getContentPane().add(ABplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 140, 130));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inventory", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1550, 90));

        Bplus.setBackground(new java.awt.Color(153, 0, 0));
        Bplus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\B+.png")); // NOI18N
        Bplus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BplusActionPerformed(evt);
            }
        });
        getContentPane().add(Bplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 130));

        Oplus.setBackground(new java.awt.Color(153, 0, 0));
        Oplus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\O+.png")); // NOI18N
        Oplus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Oplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OplusActionPerformed(evt);
            }
        });
        getContentPane().add(Oplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 140, 130));

        Aplus.setBackground(new java.awt.Color(153, 0, 0));
        Aplus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\A+.png")); // NOI18N
        Aplus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Aplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplusActionPerformed(evt);
            }
        });
        getContentPane().add(Aplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 130));

        Ominus.setBackground(new java.awt.Color(153, 0, 0));
        Ominus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\o-.png")); // NOI18N
        Ominus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ominus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OminusActionPerformed(evt);
            }
        });
        getContentPane().add(Ominus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 140, 130));

        Bminus.setBackground(new java.awt.Color(153, 0, 0));
        Bminus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\B-.png")); // NOI18N
        Bminus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BminusActionPerformed(evt);
            }
        });
        getContentPane().add(Bminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 140, 130));

        ABminus.setBackground(new java.awt.Color(153, 0, 0));
        ABminus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\AB-.png")); // NOI18N
        ABminus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ABminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABminusActionPerformed(evt);
            }
        });
        getContentPane().add(ABminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 140, 130));

        jButton9.setBackground(new java.awt.Color(204, 0, 0));
        jButton9.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Exit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 860, 90, 30));

        ShowAll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ShowAll.setForeground(new java.awt.Color(204, 0, 0));
        ShowAll.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\icons\\list.png")); // NOI18N
        ShowAll.setText("Show All");
        getContentPane().add(ShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 760, 160, 40));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blood Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 360, 810));
        getContentPane().add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 1170, 800));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1550, 970));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AminusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AminusActionPerformed

    private void ABplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABplusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ABplusActionPerformed

    private void BplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BplusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BplusActionPerformed

    private void OplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OplusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OplusActionPerformed

    private void AplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplusActionPerformed
        // TODO add your handling code here:
       
        
        
       
        
                                   
        
        
    }//GEN-LAST:event_AplusActionPerformed

    private void OminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OminusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OminusActionPerformed

    private void BminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BminusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BminusActionPerformed

    private void ABminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABminusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ABminusActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        dispose();
        
        
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABminus;
    private javax.swing.JButton ABplus;
    private javax.swing.JButton Aminus;
    private javax.swing.JButton Aplus;
    private javax.swing.JButton Bminus;
    private javax.swing.JButton Bplus;
    private javax.swing.JButton Ominus;
    private javax.swing.JButton Oplus;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton ShowAll;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

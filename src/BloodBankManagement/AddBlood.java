
package BloodBankManagement;

import java.awt.print.PrinterException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.awt.print.*;

import javax.swing.JTextArea;
import BloodBankManagement.Printing;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;



import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 *
 * @author Souleymane
 */
public class AddBlood extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBlood
     */
    public AddBlood() {
        initComponents();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        printButton = new javax.swing.JButton();
        Generate = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        bloodtype = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        last = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BloodField = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        first1 = new javax.swing.JLabel();
        FirstnameField2 = new javax.swing.JTextField();
        FirstnameField1 = new javax.swing.JTextField();
        searchField = new javax.swing.JTextField();
        collectorLastName1 = new javax.swing.JLabel();
        collectorFirstName1 = new javax.swing.JLabel();
        collectorAddress = new javax.swing.JLabel();
        CollectionDate2 = new javax.swing.JLabel();
        collectorDate = new javax.swing.JLabel();
        CollAddress = new javax.swing.JTextField();
        Exit = new javax.swing.JButton();
        CollectorFirst = new javax.swing.JLabel();
        PanelToPrint = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        CollectionField = new javax.swing.JLabel();
        UnitNumber = new javax.swing.JLabel();
        ExpireField = new javax.swing.JLabel();
        bloodType = new javax.swing.JLabel();
        BloodTypeField = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        volLast = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        volunteerFirstName = new javax.swing.JLabel();
        volFist = new javax.swing.JLabel();
        BloodClass = new javax.swing.JLabel();
        CollectionbyFirstName = new javax.swing.JLabel();
        CollectionbyLast1 = new javax.swing.JLabel();
        colladdresss = new javax.swing.JLabel();
        CollTime = new javax.swing.JLabel();
        CollectedTime = new javax.swing.JLabel();
        CollectedAt = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PrintPane = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printButton.setBackground(new java.awt.Color(51, 204, 0));
        printButton.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        printButton.setText("print");
        printButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        getContentPane().add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 890, 144, 42));

        Generate.setBackground(new java.awt.Color(204, 204, 0));
        Generate.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Generate.setText("Generate");
        Generate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });
        getContentPane().add(Generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 890, 144, 42));

        Search.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 110, 30));

        bloodtype.setFont(new java.awt.Font("Bahnschrift", 1, 21)); // NOI18N
        bloodtype.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(bloodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 130, 30));

        dob.setFont(new java.awt.Font("Bahnschrift", 1, 21)); // NOI18N
        dob.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 210, 40));

        last.setFont(new java.awt.Font("Bahnschrift", 1, 21)); // NOI18N
        last.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, 30));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lastname:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 130, 30));

        BloodField.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        BloodField.setForeground(new java.awt.Color(255, 255, 255));
        BloodField.setText("Blood Type:");
        getContentPane().add(BloodField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 130, 30));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of Birth:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, 30));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Firstname:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 140, 30));

        first1.setFont(new java.awt.Font("Bahnschrift", 1, 21)); // NOI18N
        first1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(first1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 250, 30));

        FirstnameField2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        getContentPane().add(FirstnameField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 330, 30));

        FirstnameField1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        getContentPane().add(FirstnameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 330, 30));

        searchField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 440, 40));

        collectorLastName1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        collectorLastName1.setForeground(new java.awt.Color(255, 255, 255));
        collectorLastName1.setText("Lastname:");
        getContentPane().add(collectorLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 110, 40));

        collectorFirstName1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        collectorFirstName1.setForeground(new java.awt.Color(255, 255, 255));
        collectorFirstName1.setText("Firstname:");
        getContentPane().add(collectorFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 110, 40));

        collectorAddress.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        collectorAddress.setForeground(new java.awt.Color(255, 255, 255));
        collectorAddress.setText("Collection Date:");
        getContentPane().add(collectorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 160, 40));

        CollectionDate2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        getContentPane().add(CollectionDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, 240, 40));

        collectorDate.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        collectorDate.setForeground(new java.awt.Color(255, 255, 255));
        collectorDate.setText("Collection Address:");
        getContentPane().add(collectorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, 170, 40));

        CollAddress.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        getContentPane().add(CollAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 710, 390, 40));

        Exit.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Exit.setText("Exit");
        Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 890, 144, 42));

        CollectorFirst.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        getContentPane().add(CollectorFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 750, 130, 40));

        PanelToPrint.setBackground(new java.awt.Color(249, 249, 249));
        PanelToPrint.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        PanelToPrint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel15.setText("Collection Date    |       Unit Number         |       Expires");
        PanelToPrint.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 610, 60));

        CollectionField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        CollectionField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CollectionField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        PanelToPrint.add(CollectionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 40));

        UnitNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        PanelToPrint.add(UnitNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 190, 40));

        ExpireField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        ExpireField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExpireField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        PanelToPrint.add(ExpireField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 190, 40));

        bloodType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        PanelToPrint.add(bloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 260, 370));

        BloodTypeField.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        BloodTypeField.setText("Rh Positive");
        PanelToPrint.add(BloodTypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 200, 40));

        jLabel31.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setText("CPDA -1 Whole Blood");
        PanelToPrint.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, 90));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Approx :500 ml");
        PanelToPrint.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 140, 50));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel16.setText("See Circular Information for indication,  ");
        PanelToPrint.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 330, 60));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel17.setText("Contraindications caution and Methods of Infusion");
        PanelToPrint.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 330, 40));

        jLabel32.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("VOLUNTEER DONOR");
        PanelToPrint.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 340, 50));

        jLabel33.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel33.setText("This Product may transmit Infectious Agents");
        PanelToPrint.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 330, 40));

        volLast.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        volLast.setText("0");
        PanelToPrint.add(volLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 200, 50));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setText("Collection Information");
        PanelToPrint.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, 210, 50));

        volunteerFirstName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        volunteerFirstName.setText("Volunteer Name:");
        PanelToPrint.add(volunteerFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 140, 50));

        volFist.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        volFist.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        volFist.setText("0");
        PanelToPrint.add(volFist, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 120, 40));

        BloodClass.setFont(new java.awt.Font("Arial", 1, 300)); // NOI18N
        BloodClass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelToPrint.add(BloodClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 230, 260));

        CollectionbyFirstName.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        CollectionbyFirstName.setText("Souleymane ");
        PanelToPrint.add(CollectionbyFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 790, 130, 40));

        CollectionbyLast1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        CollectionbyLast1.setText("Sono");
        PanelToPrint.add(CollectionbyLast1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 790, 110, 40));

        colladdresss.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        colladdresss.setText("150 North Street");
        PanelToPrint.add(colladdresss, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 830, 230, 40));

        CollTime.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        CollTime.setText("12:10 PM");
        PanelToPrint.add(CollTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 830, 140, 40));

        CollectedTime.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        CollectedTime.setText("Collected Time:");
        PanelToPrint.add(CollectedTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 830, 140, 40));

        CollectedAt.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        CollectedAt.setText("Collected at:");
        PanelToPrint.add(CollectedAt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 830, 140, 40));

        jLabel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        PanelToPrint.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 630, 160));

        getContentPane().add(PanelToPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 690, 910));

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Donnor Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 680, 370));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Collector Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 680, 310));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 720, 950));

        PrintPane.setBackground(new java.awt.Color(255, 255, 255));
        PrintPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(PrintPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 740, 950));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1560, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
       Printing print = new Printing();
       print.printLabel(PanelToPrint);
    }//GEN-LAST:event_printButtonActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        PreparedStatement search = null;
        ResultSet rs = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://bloodbankdata.database.windows.net:1433;database=bloodBank;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;",
                    "csiadmin", "7ousRespo3!");

            String query = "SELECT * FROM Registration WHERE DonorID = ? OR LastName = ?";
            String donorValue = searchField.getText();  // Corrected typo from `searchFiedl` to `searchField`
            search = con.prepareStatement(query);
            search.setString(1, donorValue);
            search.setString(2, donorValue);

            rs = search.executeQuery();

            if (rs.next()) {
                // Populate fields with the found donor's data
                first1.setText(rs.getString("FirstName"));
                last.setText(rs.getString("LastName"));
                //middle.setText(rs.getString("middlename"));
                //gender.setText(rs.getString("gender"));
                bloodtype.setText(rs.getString("BloodType"));
                //addr.setText(rs.getString("address"));
                //city.setText(rs.getString("city"));
                String dobString = rs.getString("DateOfBirth");
                
                SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                SimpleDateFormat outputFormat = new SimpleDateFormat("MM/dd/yyyy");

                Date dobDate; 
                dobDate = inputFormat.parse(dobString);              
                String formattedDob = outputFormat.format(dobDate);

                // Set the formatted DOB in the dob field
                dob.setText(formattedDob);
                
                
                
                
                //dob.setText(rs.getString("dob"));
                // Uncomment email field if needed: email.setText(rs.getString("email"));

                JOptionPane.showMessageDialog(this, "Donor Found");
            } else {
                JOptionPane.showMessageDialog(this, "Donor not Found");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DBconnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DeleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(AddBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            // Close resources in reverse order of opening
            try {
                if (rs != null) rs.close();
                if (search != null) search.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(DeleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }
    }//GEN-LAST:event_SearchActionPerformed

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        // Get the current date in MM/dd/yyyy format
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDate ExpirationDate = currentDate.plusDays(42);
        

        // Define the formats
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");  // Military time format
        String formatedExpiration = ExpirationDate.format(dateFormatter);

        // Format the current date and time
        String formattedDate = currentDate.format(dateFormatter);
        String formattedTime = currentTime.format(timeFormatter);
        // Set the collection date fields to current date
        CollTime.setText(formattedTime );
        CollectionField.setText(formattedDate);
        colladdresss.setText(formattedDate);
        String Collfirst = FirstnameField1.getText();
        String CollLast = FirstnameField2.getText();
        String CollAdd = CollAddress.getText();
        
        
        //CollTime.setText(Collfirst);
        ExpireField.setText(formatedExpiration);
        CollectorFirst.setText(Collfirst);
        CollectionbyFirstName.setText(Collfirst);
        colladdresss.setText(CollAdd);
        CollectionbyLast1.setText(CollLast);
        // Database connection and query
        Connection con = null;
        PreparedStatement search = null;
        ResultSet rs = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://bloodbankdata.database.windows.net:1433;database=bloodBank;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;",
                    "csiadmin", "7ousRespo3!");

            // SQL query to find donor by ID or Lastname
            String query = "SELECT * FROM Registration WHERE DonorID = ? OR LastName = ?";
            String donorValue = searchField.getText();  // Get input from search field

            search = con.prepareStatement(query);
            search.setString(1, donorValue);
            search.setString(2, donorValue);

            rs = search.executeQuery();

            if (rs.next()) {
                // Populate fields with the donor's information
                volFist.setText(rs.getString("FirstName"));  // Set Firstname
                volLast.setText(rs.getString("LastName"));   // Set Lastname
                dob.setText(rs.getString("DateOfBirth"));
                
                

                // Check and set blood type
                String bloodType = rs.getString("BloodType");
                if (bloodType != null) {
                    if (bloodType.equals("A+")) {
                        BloodTypeField.setText("Rh Positive");
                        // Set Arial font, size 300 for the blood type label or field
                        BloodClass.setText("A");
                        BloodClass.setFont(new Font("Arial", Font.BOLD, 300));
                    } else if (bloodType.equals("A-")) {
                        BloodTypeField.setText("Rh Negative");
                        // Set Arial font, size 300 for the blood type label or field
                        BloodClass.setText("A");
                        BloodClass.setFont(new Font("Arial", Font.BOLD, 300));
                    } else if (bloodType.equals("B+")) {
                        BloodTypeField.setText("Rh Positive");
                        BloodClass.setText("B");
                        BloodClass.setFont(new Font("Arial", Font.BOLD, 300));
                    } else if (bloodType.equals("B-")) {
                        BloodTypeField.setText("Rh Negative");
                        BloodClass.setText("B");
                        BloodClass.setFont(new Font("Arial", Font.BOLD, 300));
                    } else if (bloodType.equals("O+")) {
                        BloodTypeField.setText("Rh Positive");
                        BloodClass.setText("O");
                        BloodClass.setFont(new Font("Arial", Font.BOLD, 200));
                    } else if (bloodType.equals("O-")) {
                        BloodClass.setText("O");
                        BloodClass.setFont(new Font("Arial", Font.BOLD, 200));
                        BloodTypeField.setText("Rh Negative");
                    } else if (bloodType.equals("AB+")) {
                        BloodClass.setText("AB");
                        BloodClass.setFont(new Font("Arial", Font.BOLD, 150));
                        BloodTypeField.setText("Rh Positive");
                    } else if (bloodType.equals("AB-")) {
                        BloodClass.setText("AB");
                        BloodClass.setFont(new Font("Arial", Font.BOLD, 150));
                        BloodTypeField.setText("Rh Negative");
                    } else {
                        BloodTypeField.setText(bloodType);  // For any other blood types, display as is
                    }
                } else {
                    BloodTypeField.setText("No Blood Type Found");
                }

                // Show a message indicating the donor is found
                JOptionPane.showMessageDialog(this, "Label Generated");

            } else {
                // If no donor is found
                JOptionPane.showMessageDialog(this, "Couln't Get Label");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DBconnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(UpdateDonorInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            // Close resources in reverse order of opening
            try {
                if (rs != null) rs.close();
                if (search != null) search.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(UpdateDonorInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_GenerateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodClass;
    private javax.swing.JLabel BloodField;
    private javax.swing.JLabel BloodTypeField;
    private javax.swing.JTextField CollAddress;
    private javax.swing.JLabel CollTime;
    private javax.swing.JLabel CollectedAt;
    private javax.swing.JLabel CollectedTime;
    private javax.swing.JLabel CollectionDate2;
    private javax.swing.JLabel CollectionField;
    private javax.swing.JLabel CollectionbyFirstName;
    private javax.swing.JLabel CollectionbyLast1;
    private javax.swing.JLabel CollectorFirst;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel ExpireField;
    private javax.swing.JTextField FirstnameField1;
    private javax.swing.JTextField FirstnameField2;
    private javax.swing.JButton Generate;
    private javax.swing.JPanel PanelToPrint;
    private javax.swing.JLabel PrintPane;
    private javax.swing.JButton Search;
    private javax.swing.JLabel UnitNumber;
    private javax.swing.JLabel bloodType;
    private javax.swing.JLabel bloodtype;
    private javax.swing.JLabel colladdresss;
    private javax.swing.JLabel collectorAddress;
    private javax.swing.JLabel collectorDate;
    private javax.swing.JLabel collectorFirstName1;
    private javax.swing.JLabel collectorLastName1;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel first1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel last;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel volFist;
    private javax.swing.JLabel volLast;
    private javax.swing.JLabel volunteerFirstName;
    // End of variables declaration//GEN-END:variables
}
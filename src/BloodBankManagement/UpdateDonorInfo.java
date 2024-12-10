
package BloodBankManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Souleymane.Sono
 */
public class UpdateDonorInfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateDonor
     */
    public UpdateDonorInfo() {
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

        last1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        email = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        bloodtype1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        city1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        state1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        zip = new javax.swing.JLabel();
        addr = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        place1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        gender1 = new javax.swing.JLabel();
        dob1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        middle = new javax.swing.JLabel();
        first = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        last = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        place = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bloodtype = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        city = new javax.swing.JTextField();
        zipField = new javax.swing.JTextField();
        state = new javax.swing.JComboBox<>();
        firstField = new javax.swing.JTextField();
        lastField = new javax.swing.JTextField();
        middleField = new javax.swing.JTextField();
        telField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        last1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N

        setBackground(new java.awt.Color(204, 51, 0));
        setClosable(true);
        setIconifiable(true);
        setTitle("Update Donor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Donor Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(817, 1200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 15), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Donor ID or Lastname:*");

        searchField.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        searchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 47, 750, 170));

        email.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, 280, 36));

        tel.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        tel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 260, 36));

        bloodtype1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        bloodtype1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(bloodtype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 730, 260, 36));

        jLabel31.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Telephone:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 75, 27));

        jLabel32.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Email:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 58, 27));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("City:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 43, 27));

        city1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        city1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(city1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 115, 36));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("State:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 43, 27));

        state1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        state1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(state1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 115, 36));

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Zip:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 43, 27));

        zip.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        zip.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 115, 36));

        addr.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        addr.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(addr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 280, 36));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Address:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, 27));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Place of Birth:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 108, 27));

        place1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        place1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(place1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 169, 36));

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Sex:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 59, 27));

        gender1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        gender1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(gender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 115, 36));

        dob1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        dob1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 188, 36));

        jLabel21.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Date of Birth:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 104, 40));

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Middle Name:*");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 120, 27));

        middle.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        middle.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(middle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 140, 36));

        first.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        first.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(first, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 300, 190, 36));

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Lastname:*");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 98, 27));

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Firstname:*");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 98, 27));

        jLabel30.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Blood Type");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 90, 27));

        last.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        last.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 188, 36));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Donor Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 740, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 15, 780, 860));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Firstname:*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 98, 27));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Lastname:*");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 98, 27));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Middle Name:*");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 120, 27));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date of Birth:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 247, 104, 40));

        dob.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        dob.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, 188, 36));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sex:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 59, 27));

        gender.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 115, 36));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Place of Birth:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 108, 27));

        place.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        place.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(place, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 169, 36));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, -1, 27));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("City:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 43, 27));

        jLabel28.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Email:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 58, 27));

        jLabel29.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Telephone:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, 75, 27));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("State:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, 43, 27));

        bloodtype.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bloodtype.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(bloodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 160, 36));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Zip:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 410, 43, 27));

        clear.setBackground(new java.awt.Color(51, 255, 0));
        clear.setFont(new java.awt.Font("Bahnschrift", 0, 19)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 750, 112, 34));

        Update.setFont(new java.awt.Font("Bahnschrift", 0, 19)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 750, 112, 34));

        city.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 130, 30));

        zipField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        zipField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipFieldActionPerformed(evt);
            }
        });
        getContentPane().add(zipField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 410, 120, 30));

        state.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "AL|Alabama", "AK|Alaska", "AZ|Arizona", "AR|Arkansas", "CA|California", "CO|Colorado", "CT|Connecticut", "DE|Delaware", "FL|Florida", "GA|Georgia", "HI|Hawaii", "ID|Idaho", "IL|Illinois", "IN|Indiana", "IA|Iowa", "KS|Kansas", "KY|Kentucky", "LA|Louisiana", "ME|Maine", "MD|Maryland", "MA|Massachusetts", "MI|Michigan", "MN|Minnesota", "MS|Mississippi", "MO|Missouri", "MT|Montana", "NE|Nebraska", "NV|Nevada", "NH|New Hampshire", "NJ|New Jersey", "NM|New Mexico", "NY|New York", "NC|North Carolina", "ND|North Dakota", "OH|Ohio", "OK|Oklahoma", "OR|Oregon", "PA|Pennsylvania", "RI|Rhode Island", "SC|South Carolina", "SD|South Dakota", "TN|Tennessee", "TX|Texas", "UT|Utah", "VT|Vermont", "VA|Virginia", "WA|Washington", "WV|West Virginia", "WI|Wisconsin", "WY|Wyoming", "DC|District of Columbia", "AS|American Samoa", "GU|Guam", "MP|Northern Mariana Islands", "PR|Puerto Rico", "UM|United States Minor Outlying Islands", "VI|Virgin Islands, U.S." }));
        getContentPane().add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 410, 130, 30));

        firstField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        firstField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstFieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstField, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 240, 30));

        lastField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lastField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastFieldActionPerformed(evt);
            }
        });
        getContentPane().add(lastField, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, 240, 30));

        middleField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        middleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleFieldActionPerformed(evt);
            }
        });
        getContentPane().add(middleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 220, 30));

        telField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        telField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telFieldActionPerformed(evt);
            }
        });
        getContentPane().add(telField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, 230, 30));

        emailField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 230, 30));

        addressField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        getContentPane().add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, 330, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Donor New Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 610, 850));

        jLabel33.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Blood Type");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, 75, 27));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1520, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, 1520, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        first.setText("");
        last.setText("");
        middle.setText("");
        gender.setText("");
        bloodtype.setText("");
        addr.setText("");
        city1.setText("");
        city.setText("");
        dob.setText("");
        dob1.setText("");
        email.setText("");
        state1.setText("");
        tel.setText("");
        place.setText("");
        place1.setText("");
        zip.setText("");
        gender1.setText("");
        
    
    }//GEN-LAST:event_clearActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        PreparedStatement search = null;
        ResultSet rs = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(
                    "jdbc:sqlserver://bloodbankdata.database.windows.net:1433;database=bloodBank;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;",
                    "csiadmin", "7ousRespo3!");

            String query = "SELECT * FROM Registration WHERE DonorID = ? OR LastName = ?";
            String donorValue = searchField.getText();  // Corrected typo from `searchFiedl` to `searchField`

            search = con.prepareStatement(query);

            // Check if donorValue can be parsed as an integer (for DonorID)
            try {
                int donorID = Integer.parseInt(donorValue);  // Try to parse it as an integer
                search.setInt(1, donorID);  // Set it for DonorID
            } catch (NumberFormatException e) {
                search.setNull(1, java.sql.Types.INTEGER);  // If not a valid integer, set as null
            }

            search.setString(2, donorValue);  // Set LastName as a string

            rs = search.executeQuery();

            if (rs.next()) {
                
                first.setText(rs.getString("FirstName"));
                last.setText(rs.getString("LastName"));
                middle.setText(rs.getString("MiddleName"));
                gender1.setText(rs.getString("Sex"));
                gender.setText(rs.getString("Sex"));
                bloodtype1.setText(rs.getString("BloodType"));
                bloodtype.setText(rs.getString("BloodType"));
                addr.setText(rs.getString("DonorAddr"));
                city1.setText(rs.getString("City"));
                dob.setText(rs.getString("DateOfBirth"));
                dob1.setText(rs.getString("DateOfBirth"));
                email.setText(rs.getString("Email"));
                state1.setText(rs.getString("states"));
                tel.setText(rs.getString("Telephone"));
                place1.setText(rs.getString("PlaceOfBirth"));
                place.setText(rs.getString("PlaceOfBirth"));
                zip.setText(rs.getString("Zip"));

                

                JOptionPane.showMessageDialog(this, "Donor Found");
            } else {
                JOptionPane.showMessageDialog(this, "Donor not Found");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDonorInfo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Close resources in reverse order of opening
            try {
                if (rs != null) rs.close();
                if (search != null) search.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                Logger.getLogger(UpdateDonorInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
        
        
        
        
    }//GEN-LAST:event_SearchActionPerformed
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
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
                                              
                                          
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to update this donor's information?", "Confirm Update", JOptionPane.YES_NO_OPTION);
    
        // Proceed only if the user clicks "Yes"
        if (confirm == JOptionPane.YES_OPTION) {
            Connection con = null;
            PreparedStatement updateStmt = null;

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con = getConnection();

                String query = "UPDATE Registration SET FirstName = ?, LastName = ?, middleName = ?, DonorAddr = ?, City = ?, Telephone = ?, Email = ?, zip = ?, states = ? WHERE DonorID = ?";
                String DonorId = searchField.getText(); // Assume donor ID is in searchField

                // Prepare the statement
                updateStmt = con.prepareStatement(query);
                updateStmt.setString(1, firstField.getText());
                updateStmt.setString(2, lastField.getText());
                updateStmt.setString(3, middleField.getText());
                updateStmt.setString(4, addr.getText());
                updateStmt.setString(5, city.getText());
                updateStmt.setString(6, telField.getText());
                updateStmt.setString(7, emailField.getText());               
                updateStmt.setString(8, zipField.getText());
                updateStmt.setString(9, state.getSelectedItem().toString());
                updateStmt.setString(10, DonorId); // Use the donor's ID for update

                int rowsAffected = updateStmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Donor information updated successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "Update failed. Donor not found.");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(UpdateDonorInfo.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                // Close resources to prevent memory leaks
                try {
                    if (updateStmt != null) updateStmt.close();
                    if (con != null) con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UpdateDonorInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            // User selected "No," so we skip the update process
            JOptionPane.showMessageDialog(this, "Update cancelled.");
        }




        
        
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void zipFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipFieldActionPerformed

    private void firstFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstFieldActionPerformed

    private void lastFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastFieldActionPerformed

    private void middleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleFieldActionPerformed

    private void telFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JButton Update;
    private javax.swing.JLabel addr;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel bloodtype;
    private javax.swing.JLabel bloodtype1;
    private javax.swing.JTextField city;
    private javax.swing.JLabel city1;
    private javax.swing.JButton clear;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel dob1;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel first;
    private javax.swing.JTextField firstField;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel gender1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel last;
    private javax.swing.JLabel last1;
    private javax.swing.JTextField lastField;
    private javax.swing.JLabel middle;
    private javax.swing.JTextField middleField;
    private javax.swing.JLabel place;
    private javax.swing.JLabel place1;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JLabel state1;
    private javax.swing.JLabel tel;
    private javax.swing.JTextField telField;
    private javax.swing.JLabel zip;
    private javax.swing.JTextField zipField;
    // End of variables declaration//GEN-END:variables
}

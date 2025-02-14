/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package BloodBankManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Souleymane.Sono
 */
public class Registration extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
    }
    Connection con;
    PreparedStatement insert;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        middleName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        placeOB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        state = new javax.swing.JComboBox<>();
        zip = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bloodType = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        DateofBirth = new de.wannawork.jcalendar.JCalendarComboBox();
        genderUser = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Emgencyfname = new javax.swing.JTextField();
        Emgencylname = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Emgencytel = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        relation = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Emgencyemail = new javax.swing.JTextField();
        Test = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registration");
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 245, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Donor Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 0, 14), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 17), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name:*");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sex:");

        firstName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        firstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lastName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        lastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Name:*");

        middleName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        middleName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Middle Name:*");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date of Birth:");

        placeOB.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        placeOB.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address:");

        address.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("State:");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("City:");

        city.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        city.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        state.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "AL|Alabama", "AK|Alaska", "AZ|Arizona", "AR|Arkansas", "CA|California", "CO|Colorado", "CT|Connecticut", "DE|Delaware", "FL|Florida", "GA|Georgia", "HI|Hawaii", "ID|Idaho", "IL|Illinois", "IN|Indiana", "IA|Iowa", "KS|Kansas", "KY|Kentucky", "LA|Louisiana", "ME|Maine", "MD|Maryland", "MA|Massachusetts", "MI|Michigan", "MN|Minnesota", "MS|Mississippi", "MO|Missouri", "MT|Montana", "NE|Nebraska", "NV|Nevada", "NH|New Hampshire", "NJ|New Jersey", "NM|New Mexico", "NY|New York", "NC|North Carolina", "ND|North Dakota", "OH|Ohio", "OK|Oklahoma", "OR|Oregon", "PA|Pennsylvania", "RI|Rhode Island", "SC|South Carolina", "SD|South Dakota", "TN|Tennessee", "TX|Texas", "UT|Utah", "VT|Vermont", "VA|Virginia", "WA|Washington", "WV|West Virginia", "WI|Wisconsin", "WY|Wyoming", "DC|District of Columbia", "AS|American Samoa", "GU|Guam", "MP|Northern Mariana Islands", "PR|Puerto Rico", "UM|United States Minor Outlying Islands", "VI|Virgin Islands, U.S." }));

        zip.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        zip.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Zip:");

        jLabel28.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Email:");

        emailField.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel29.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Telephone:");

        telephone.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        telephone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Blood Type");

        bloodType.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        bloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        bloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTypeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Receive Text Message?");

        jCheckBox1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Yes");

        jCheckBox2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("No");

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Place of Birth:");

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\icons\\login.png")); // NOI18N

        genderUser.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        genderUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "Male", "Female" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(jCheckBox1)
                        .addGap(26, 26, 26)
                        .addComponent(jCheckBox2)
                        .addGap(134, 134, 134))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genderUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(city)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(address))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeOB, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(middleName, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middleName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(placeOB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genderUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 840, 520));

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emmergency Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 17), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("First Name:*");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 32, 104, 27));

        Emgencyfname.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        Emgencyfname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(Emgencyfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 30, 263, 32));

        Emgencylname.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        Emgencylname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(Emgencylname, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 30, 210, 32));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Last Name:*");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 32, 104, 27));

        Emgencytel.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        Emgencytel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(Emgencytel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 74, 263, 32));

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Telephone:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 76, 104, 27));

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("RelationShip:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 172, 108, 27));

        relation.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        relation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(relation, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 171, 259, 30));

        jButton7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\icons\\close.png")); // NOI18N
        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel21.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Email:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 120, 104, 27));

        Emgencyemail.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        Emgencyemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(Emgencyemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 118, 259, 32));

        Test.setText("0");
        jPanel4.add(Test, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 280, 40));

        Add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon("C:\\Users\\Souleymane\\Downloads\\Current\\BloodBankProject-master\\src\\resources\\icons\\plus.png")); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel4.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 80, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 840, 300));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 880, 900));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 881, 878));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void bloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodTypeActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        
      

    }//GEN-LAST:event_jButton7ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

       // Ensure you get the date as a string from the DatePicker
            Date date = DateofBirth.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateofbirth = (date != null) ? sdf.format(date) : null;  // Format the date to a string, or set it to null

            // Get all fields data
            String firstname = firstName.getText();
            String lastname = lastName.getText();
            String middlename = middleName.getText();
            String placeofbirth = placeOB.getText();
            String addr = address.getText();
            String stateuser = state.getSelectedItem().toString();
            String cityuser = city.getText();
            String zipuser = zip.getText();
            String tel = telephone.getText();
            String donorEmail = emailField.getText();
            String emfirst = Emgencyfname.getText();
            String emlast = Emgencylname.getText();
            String emEmail = Emgencyemail.getText();
            String emTel = Emgencytel.getText();
            String rel = relation.getText();
            String gend = genderUser.getSelectedItem().toString();
            String blood = bloodType.getSelectedItem().toString();

            // Log the data being passed
            System.out.println("Inserting data:");
            System.out.println("FirstName: " + firstname);
            System.out.println("LastName: " + lastname);
            System.out.println("DateOfBirth: " + dateofbirth);
            System.out.println("State: " + stateuser);
            System.out.println("City: " + cityuser);
            System.out.println("Zip: " + zipuser);
            System.out.println("Telephone: " + tel);

            try {
                // Establish connection
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con =getConnection();

                // Check if connection is successful
                if (con != null) {
                    System.out.println("Database connection established.");
                } else {
                    System.out.println("Failed to establish database connection.");
                    return; // Exit if connection fails
                }

                // Prepare the SQL query
                String insertQuery = "INSERT INTO Registration (FirstName, LastName, middleName, DateOfBirth, placeofbirth, DonorAddr, states, City, zip, Telephone, Email, BloodType, emFirst, emLast, EmEmail, EmTel, Relation, Sex) " +
                                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

                // Prepare the statement
                insert = con.prepareStatement(insertQuery);
                if (insert != null) {
                    System.out.println("Prepared statement created successfully.");
                } else {
                    System.out.println("Failed to create prepared statement.");
                    return; // Exit if preparation fails
                }

                // Set the parameters in the correct order
                insert.setString(1, firstname);
                insert.setString(2, lastname);
                insert.setString(3, middlename);
                insert.setString(4, dateofbirth);  // Formatted date string
                insert.setString(5, placeofbirth);
                insert.setString(6, addr);
                insert.setString(7, stateuser);  // Make sure the State field is set correctly
                insert.setString(8, cityuser);   // Make sure the City field is set correctly
                insert.setString(9, zipuser);    // Zip field
                insert.setString(10, tel);       // Telephone field
                insert.setString(11, donorEmail); // Email field
                insert.setString(12, blood);     // Blood type field
                insert.setString(13, emfirst);   // Emergency contact first name
                insert.setString(14, emlast);    // Emergency contact last name
                insert.setString(15, emEmail);   // Emergency contact email
                insert.setString(16, emTel);     // Emergency contact telephone
                insert.setString(17, rel);       // Relation field
                insert.setString(18, gend);      // Gender field

                // Execute the query
                int k = insert.executeUpdate();

                // Check the result and provide feedback
                if (k == 1) {
                    JOptionPane.showMessageDialog(this, "Donor added successfully!");
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add donor.");
                }

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Driver not found: " + ex.getMessage());
                Logger.getLogger(ConnectData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }

            
           

    }//GEN-LAST:event_AddActionPerformed
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private de.wannawork.jcalendar.JCalendarComboBox DateofBirth;
    private javax.swing.JTextField Emgencyemail;
    private javax.swing.JTextField Emgencyfname;
    private javax.swing.JTextField Emgencylname;
    private javax.swing.JTextField Emgencytel;
    private javax.swing.JLabel Test;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> bloodType;
    private javax.swing.JTextField city;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstName;
    private javax.swing.JComboBox<String> genderUser;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField middleName;
    private javax.swing.JTextField placeOB;
    private javax.swing.JTextField relation;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField zip;
    // End of variables declaration//GEN-END:variables
}

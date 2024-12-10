/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodBankManagement;

/**
 *
 * @author Souleymane
 */

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetDatafromSever {

    private JTable donorTable;

    public GetDatafromSever(JTable donorTable) {
        this.donorTable = donorTable;
    }

    public void retrieveDonorData(String bloodTypeFilter) {
        // Base SQL query
        String query = "SELECT " +
                "CONCAT(i.Firstname, ' ', i.Lastname) AS full_name, " +
                "i.BloodID, " +
                "i.CollectionDate, " +
                "i.collectedBy, " +
                "i.ExpirationDate, " +
                "i.BloodType " +
                "FROM Inventory i";

        // Add a WHERE clause if filtering by blood type
        if (bloodTypeFilter != null && !bloodTypeFilter.isEmpty()) {
            query += " WHERE i.BloodType = ?";
        }

        String connectionString = "jdbc:sqlserver://bloodbankdata.database.windows.net:1433;" +
                                  "database=bloodBank;encrypt=true;trustServerCertificate=false;" +
                                  "hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        String username = "csiadmin";
        String password = "7ousRespo3!";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection(connectionString, username, password);
                 PreparedStatement pstmt = con.prepareStatement(query)) {

                // Set the blood type parameter if filtering
                if (bloodTypeFilter != null && !bloodTypeFilter.isEmpty()) {
                    pstmt.setString(1, bloodTypeFilter);
                }

                try (ResultSet rs = pstmt.executeQuery()) {
                    DefaultTableModel tableModel = (DefaultTableModel) donorTable.getModel();
                    tableModel.setRowCount(0); // Clear existing rows

                    while (rs.next()) {
                        String bloodID = rs.getString("BloodID");
                        String fullName = rs.getString("full_name");
                        String bloodType = rs.getString("BloodType");
                        String collectionDate = rs.getString("CollectionDate");
                        String collectedBy = rs.getString("collectedBy");
                        String expirationDate = rs.getString("ExpirationDate");

                        // Add the row to the table
                        tableModel.addRow(new Object[]{bloodID, fullName, bloodType, collectionDate, collectedBy, expirationDate});
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error retrieving data: " + ex.getMessage());
        }
    }
}




/*
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetDatafromSever {

    private JTable donorTable;

    // Constructor that accepts the JTable to populate it
    public GetDatafromSever(JTable donorTable) {
        this.donorTable = donorTable;
    }

    // Method to retrieve and populate all donor data
    public void retrieveDonorData() {
        String query = "SELECT " +
                "CONCAT(i.Firstname, ' ', i.Lastname) AS full_name, " +
                "i.BloodID, " +
                "i.CollectionDate, " +
                "i.collectedBy, " +
                "i.ExpirationDate, " +
                "i.BloodType " +
                "FROM Inventory i";

        populateTable(query);
    }

    // New method to filter and display donors by blood type
    

    // Helper method to execute a query and populate the JTable
    private void populateTable(String query, String... params) {
        // Database connection details (replace with actual credentials)
        String connectionString = "jdbc:sqlserver://bloodbankdata.database.windows.net:1433;" +
                                  "database=bloodBank;encrypt=true;trustServerCertificate=false;" +
                                  "hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        String username = "csiadmin";  // Replace with your DB username
        String password = "7ousRespo3!";  // Replace with your DB password

        try {
            // Load the SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establish the connection to the database
            try (Connection con = DriverManager.getConnection(connectionString, username, password);
                 PreparedStatement pstmt = con.prepareStatement(query)) {

                // Set parameters if provided
                for (int i = 0; i < params.length; i++) {
                    pstmt.setString(i + 1, params[i]);
                }

                // Execute the query
                ResultSet rs = pstmt.executeQuery();

                // Get the table model from the JTable
                DefaultTableModel tableModel = (DefaultTableModel) donorTable.getModel();

                // Clear existing rows in the table
                tableModel.setRowCount(0);

                // Add rows from the database to the JTable
                while (rs.next()) {
                    String bloodID = rs.getString("BloodID");
                    String fullName = rs.getString("full_name");
                    String bloodType = rs.getString("BloodType");
                    String collectionDate = rs.getString("CollectionDate");
                    String collectedBy = rs.getString("collectedBy");
                    String expirationDate = rs.getString("ExpirationDate");

                    // Add a row to the JTable
                    tableModel.addRow(new Object[]{bloodID, fullName, bloodType, collectionDate, collectedBy, expirationDate});
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error retrieving data: " + ex.getMessage());
        }
    }
}


*/
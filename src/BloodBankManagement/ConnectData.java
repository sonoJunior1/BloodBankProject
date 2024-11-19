/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodBankManagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Souleymane
 */
public class ConnectData {
    
    public void connect() throws SQLException{
        
        Connection con;
        PreparedStatement insert;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bloodbankdata","root", "root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

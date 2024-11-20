
package BloodBankManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Souleymane
 */
public class SQlServerConection {
     public static void main(String[] args) {
        String url = "jdbc:sqlserver://bloodbankdata.database.windows.net:1433;"
                   + "database=bloodBank;"
                   + "user=csiadmin@bloodbankdata;"
                   + "password=7ousRespo3!;"
                   + "encrypt=true;"
                   + "trustServerCertificate=false;"
                   + "hostNameInCertificate=*.database.windows.net;"
                   + "loginTimeout=30;";

        try {
            // Optionally, load the driver class (depending on your setup)
            // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connected to the database successfully!");
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}

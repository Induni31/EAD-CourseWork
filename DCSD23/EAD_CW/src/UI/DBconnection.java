
package UI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBconnection {
    public static Connection connect(){
            Connection conn = null;
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");

                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","0131");
            } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
            }
            return conn;
    }
    
}

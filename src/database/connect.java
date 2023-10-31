package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class connect {
    public Connection con;
    public Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/cafeline", "root", "");
            stm = con.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Failed Connect to Database " + e.getMessage());
        }
    }
}

package Connect;

/**
 *
 * @author Thien Linh
 */
import java.sql.Connection;
import java.sql.DriverManager;
 
public class ConnectMysqlExample {
 
    public static void main(String args[]) {
        ConnectMysqlExample.getConnection();
    }
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/congnghephanmem", "root", "123456");
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}

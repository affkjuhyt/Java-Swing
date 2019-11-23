package connect;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Thien Linh
 */
public class DBConnect {
    public static Connection getConnection() {
        Connection cons = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cons = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=shop;", "sa","123456");
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return cons;
    }
    
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Thien Linh
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import static Connect.ConnectMysqlExample.getConnection;
import java.sql.DriverManager;
import java.util.Random;

public class controller {

    private static String DB_URL = "jdbc:mysql://localhost:3306/congnghephanmem";
    private static String USER_NAME = "root";
    private static String PASSWORD = "123456";
    private static int IDSHIPER = 10;

    public static Connection getConnection(String dbURL, String userName,
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    public static void updateHoaDon(int id) throws SQLException {

        try {
            // create a java mysql database connection
//            String myDriver = "org.gjt.mm.mysql.Driver";
//            String myUrl = "jdbc:mysql://localhost/test";
//            Class.forName(myDriver);
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);

            // create the java mysql update preparedstatement
            String query = "update donhang set trangthai = ? where id = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, "Active");
            preparedStmt.setInt(2, id);

            // execute the java preparedstatement
            preparedStmt.executeUpdate();

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }

    public static void createBangShip(int idDon) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);

            // create a sql date object so we can use it in our INSERT statement
//            Calendar calendar = Calendar.getInstance();
//            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

            // the mysql insert statement
            String query = " insert into bangship (id   , idshiper, iddonhang)"
                    + " values (?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            Random rd = new Random();
            preparedStmt.setInt(1, rd.nextInt() );
            preparedStmt.setInt(2,IDSHIPER );
            preparedStmt.setInt(3, idDon);
           

            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

}

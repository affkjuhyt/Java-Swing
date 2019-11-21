package com.linh.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thien Linh
 */
public class ConnectionDatabase {
    
    private static Connection connection;
    
    public static Connection getConnection(){
        
        if (connection == null){
            
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               
                connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=qlmh;", "sa","123456");
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }
        
    return connection;
    }
    
    public static void main(String[] args) {
        
      ConnectionDatabase.getConnection();
    }

}

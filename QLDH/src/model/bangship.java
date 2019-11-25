/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connect.ConnectMysqlExample;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Thien Linh
 */
public class bangship {
    private static int IDSHIPER = 10;
    int id;
    int idShip;
    ArrayList<nhandon> listHoaDon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdShip() {
        return idShip;
    }

    public void setIdShip(int idShip) {
        this.idShip = idShip;
    }

    public ArrayList<nhandon> getListHoaDon() {
        return listHoaDon;
    }

    public void setListHoaDon(ArrayList<nhandon> listHoaDon) {
        this.listHoaDon = listHoaDon;
    }
    
    public static void createBangShip(int idDon) {
        try {
            
            Connection conn = ConnectMysqlExample.getConnection();
               
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
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
    
    public static void updateHoaDon(int id) throws SQLException {

        try {

           
                Connection conn = ConnectMysqlExample.getConnection();
                // create the java mysql update preparedstatement
                String query = "update donhang set trangthai = ? where id = ?";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, "Active");
                preparedStmt.setInt(2, id);
                
                // execute the java preparedstatement
                preparedStmt.executeUpdate();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
}

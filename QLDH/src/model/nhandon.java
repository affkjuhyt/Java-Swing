/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connect.ConnectMysqlExample;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thien Linh
 */
public class nhandon {
    int id;
    String diaChi;
    String tenHang;
    String thoiGian;
    String trangThai;
    String khachHang;

    public nhandon() {
    }
    

    public nhandon(int id, String diaChi, String tenHang, String thoiGian, String trangThai, String khachHang) {
        this.diaChi = diaChi;
        this.tenHang = tenHang;
        this.thoiGian = thoiGian;
        this.trangThai = trangThai;
        this.khachHang = khachHang;
        this.id =id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }


    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(String khachHang) {
        this.khachHang = khachHang;
    }
    
    public static ArrayList<nhandon> loadData2() {
        ArrayList<nhandon> list = new ArrayList<>();
        try {
            // connnect to database 'testdb'
            Connection conn = ConnectMysqlExample.getConnection();
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 'student'\
            //  WHERE lastname LIKE '% " + lastname.getText() + " '% "
            ResultSet rs = stmt.executeQuery("select * from donhang where trangthai LIKE 'Active' ");
            // show data
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));

                nhandon tmp = new nhandon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                list.add(tmp);
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;

    }
    
    public static ArrayList<nhandon> loadData() {
        ArrayList<nhandon> list = new ArrayList<>();
        try {
            Connection conn = ConnectMysqlExample.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from donhang where trangthai LIKE 'pending' ");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));

                nhandon tmp = new nhandon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                list.add(tmp);
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;

    }
}

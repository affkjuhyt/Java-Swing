/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thien Linh
 */
public class DanhMuc {
    private String ma_danh_muc;
    private String ten_danh_muc;
    private String danh_muc_cha;

    public DanhMuc() {
    }

    
    public DanhMuc(String ma_danh_muc, String ten_danh_muc, String danh_muc_cha) {
        this.ma_danh_muc = ma_danh_muc;
        this.ten_danh_muc = ten_danh_muc;
        this.danh_muc_cha = danh_muc_cha;
    }

    public String getMa_danh_muc() {
        return ma_danh_muc;
    }

    public void setMa_danh_muc(String ma_danh_muc) {
        this.ma_danh_muc = ma_danh_muc;
    }

    public String getTen_danh_muc() {
        return ten_danh_muc;
    }

    public void setTen_danh_muc(String ten_danh_muc) {
        this.ten_danh_muc = ten_danh_muc;
    }

    public String getDanh_muc_cha() {
        return danh_muc_cha;
    }

    public void setDanh_muc_cha(String danh_muc_cha) {
        this.danh_muc_cha = danh_muc_cha;
    }
    
    public ArrayList<DanhMuc> getListDanhMucCha() {
        Connection connection = DBConnect.getConnection();
        ArrayList<DanhMuc> arr = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from danh_muc WHERE danh_muc_cha='null'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                DanhMuc dm = new DanhMuc();
                dm.setMa_danh_muc(rs.getString("ma_danh_muc"));
                dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
                dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
                arr.add(dm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhMuc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arr;
    }

    public ArrayList<DanhMuc> getListDanhMucCon(String ma_danh_muc) {
        Connection connection = DBConnect.getConnection();
        ArrayList<DanhMuc> arr = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from danh_muc WHERE danh_muc_cha='"+ma_danh_muc+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                DanhMuc dm = new DanhMuc();
                dm.setMa_danh_muc(rs.getString("ma_danh_muc"));
                dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
                dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
                arr.add(dm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhMuc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arr;
    }
}

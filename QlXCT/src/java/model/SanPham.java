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
public class SanPham {
    private String ma_san_pham;
    private DanhMuc danh_muc;
    private String ten_san_pham;
    private String hinh_anh;
    private int so_luong;
    private String mo_ta;
    private int don_gia;
    private int giam_gia;

    public SanPham() {
    }

    public SanPham(String ma_san_pham, DanhMuc danh_muc, String ten_san_pham, String hinh_anh, int so_luong, String mo_ta, int don_gia, int giam_gia) {
        this.ma_san_pham = ma_san_pham;
        this.danh_muc = danh_muc;
        this.ten_san_pham = ten_san_pham;
        this.hinh_anh = hinh_anh;
        this.so_luong = so_luong;
        this.mo_ta = mo_ta;
        this.don_gia = don_gia;
        this.giam_gia = giam_gia;
    }

    public String getMa_san_pham() {
        return ma_san_pham;
    }

    public void setMa_san_pham(String ma_san_pham) {
        this.ma_san_pham = ma_san_pham;
    }

    public DanhMuc getDanh_muc() {
        return danh_muc;
    }

    public void setDanh_muc(DanhMuc danh_muc) {
        this.danh_muc = danh_muc;
    }

    public String getTen_san_pham() {
        return ten_san_pham;
    }

    public void setTen_san_pham(String ten_san_pham) {
        this.ten_san_pham = ten_san_pham;
    }

    public String getHinh_anh() {
        return hinh_anh;
    }

    public void setHinh_anh(String hinh_anh) {
        this.hinh_anh = hinh_anh;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public int getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(int don_gia) {
        this.don_gia = don_gia;
    }

    public int getGiam_gia() {
        return giam_gia;
    }

    public void setGiam_gia(int giam_gia) {
        this.giam_gia = giam_gia;
    }
    
    public ArrayList<SanPham> getListProductByCategory(String ma_danh_muc) {
        Connection cons = DBConnect.getConnection();
        ArrayList<SanPham> arr = new ArrayList<>();
        try {
            PreparedStatement ps = cons.prepareStatement("select * from san_pham WHERE ma_danh_muc='"+ma_danh_muc+"'");
            ResultSet rs = ps.executeQuery(); 
            while(rs.next()) {
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getString("ma_san_pham"));
                DanhMuc dm = new DanhMuc();
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("hinh_anh"));
                sp.setSo_luong(rs.getInt("so_luong"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getInt("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
                arr.add(sp);
            }
            cons.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    public SanPham getChiTietSanPham(String ma_san_pham) {
        Connection cons = DBConnect.getConnection();
        SanPham sp = new SanPham();
        try {
           PreparedStatement ps = cons.prepareStatement("select * from san_pham WHERE ma_san_pham = '"+ma_san_pham+"'");
           ResultSet rs = ps.executeQuery();
           while(rs.next()) {
                DanhMuc dm = new DanhMuc(rs.getString("ma_danh_muc"),"","");
                sp.setDanh_muc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("hinh_anh"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setSo_luong(rs.getInt("so_luong"));
                sp.setDon_gia(rs.getInt("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
           }
        } catch(SQLException ex) {
            Logger.getLogger(SanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }
    
}

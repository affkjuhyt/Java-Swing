package com.linh.mode;

import com.linh.model.database.ConnectionDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thien Linh
 */
public class History {
    private List<History> list;
    private String maDonHang;
    private String tenDonHang;
    private int gia;
    private String ngayDatDonHang;
    private String trangThaiDonHang;

    public List<History> getList() {
        return list;
    }

    public void setList(List<History> list) {
        this.list = list;
    }
    
    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getTenDonHang() {
        return tenDonHang;
    }

    public void setTenDonHang(String tenDonHang) {
        this.tenDonHang = tenDonHang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNgayDatDonHang() {
        return ngayDatDonHang;
    }

    public void setNgayDatDonHang(String ngayDatDonHang) {
        this.ngayDatDonHang = ngayDatDonHang;
    }

    public String getTrangThaiDonHang() {
        return trangThaiDonHang;
    }

    public void setTrangThaiDonHang(String trangThaiDonHang) {
        this.trangThaiDonHang = trangThaiDonHang;
    }
    
    public List<History> getAllProduct() {
    list = new ArrayList<History>();
        
        try {
            
            Statement statement = ConnectionDatabase.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM tblLsdh");
            
            while (result.next()) { 
                History product = new History();
                product.setMaDonHang(result.getString("MaDonHang"));
                product.setTenDonHang(result.getString("TenDonHang"));
                product.setGia(result.getInt("Gia"));
                product.setNgayDatDonHang(result.getString("NgayDatDonHang"));
                product.setTrangThaiDonHang(result.getString("TrangThaiDonHang"));
                list.add(product);
            }
            
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}

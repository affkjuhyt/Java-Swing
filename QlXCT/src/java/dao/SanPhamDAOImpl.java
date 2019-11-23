package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DanhMuc;
import model.SanPham;

/**
 *
 * @author Thien Linh
 */
public class SanPhamDAOImpl implements SanPhamDAO{
    
    @Override
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

    @Override
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
            Logger.getLogger(SanPhamDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }
}

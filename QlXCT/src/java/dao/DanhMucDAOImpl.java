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

/**
 *
 * @author Thien Linh
 */
public class DanhMucDAOImpl implements DanhMucDAO{
    @Override
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
            Logger.getLogger(DanhMucDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arr;
    }

    @Override
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
            Logger.getLogger(DanhMucDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arr;
    }
            
}

package com.linh.model.dao;

import com.linh.model.Product;
import com.linh.model.database.ConnectionDatabase;
import java.sql.PreparedStatement;
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
public class ProductDAO implements ImplementProduct{
    private List<Product> list;
    
    @Override
    public void input(Product product) {
        
        try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
                    + "INSERT INTO tblQlmh (MaHang, TenHang, SoLuong, GiaBanLe, GiaBanBuon, GiaNhap, NhaCungCap, NgayNhap) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            
            statement.setString(1, product.getMaHang());
            statement.setString(2, product.getTenHang());
            statement.setString(3, product.getSoLuong());
            statement.setString(4, product.getGiaBanLe());
            statement.setString(5, product.getGiaBanBuon());
            statement.setString(6, product.getGiaNhap());
            statement.setString(7, product.getNhaCungCap());
            statement.setString(8, product.getDob());
            
            statement.executeUpdate();
          
          
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void update(Product product) {
          try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
                    + "UPDATE tblQlmh SET TenHang=?, SoLuong=?, GiaBanLe=?, GiaBanBuon=?, GiaNhap=?, NhaCungCap=?, NgayNhap=? WHERE MaHang=?");
            
            statement.setString(1, product.getMaHang());
            statement.setString(2, product.getTenHang());
            statement.setString(3, product.getSoLuong());
            statement.setString(4, product.getGiaBanLe());
            statement.setString(5, product.getGiaBanBuon());
            statement.setString(6, product.getGiaNhap());
            statement.setString(7, product.getNhaCungCap());
            statement.setString(8, product.getDob());
            
          
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    @Override
    public void delete(String MaHang) {
   
          try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
                    + "DELETE FROM tblQlmh WHERE MaHang=?");
            
            statement.setString(1, MaHang);
            
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    @Override
    public List<Product> getProduct(String MaHang) {
        list = new ArrayList<Product>();
        
        try {
            
            Statement statement = ConnectionDatabase.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM tblQlmh WHERE MaHang LIKE '%" + MaHang + "%'");
            
            while (result.next()) { 
                Product product = new Product();
                product.setMaHang(result.getString("MaHang"));
                product.setTenHang(result.getString("TenHang"));
                product.setSoLuong(result.getString("SoLuong"));
                product.setGiaBanLe(result.getString("GiaBanLe"));
                product.setGiaBanBuon(result.getString("GiaBanBuon"));
                product.setGiaNhap(result.getString("GiaNhap"));
                product.setNhaCungCap(result.getString("NhaCungCap"));
                product.setDob(result.getString("NgayNhap"));
                list.add(product);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public List<Product> getAllProduct() {
    list = new ArrayList<Product>();
        
        try {
            
            Statement statement = ConnectionDatabase.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM tblQlmh");
            
            while (result.next()) { 
                Product product = new Product();
                product.setMaHang(result.getString("MaHang"));
                product.setTenHang(result.getString("TenHang"));
                product.setSoLuong(result.getString("SoLuong"));
                product.setGiaBanLe(result.getString("GiaBanLe"));
                product.setGiaBanBuon(result.getString("GiaBanBuon"));
                product.setGiaNhap(result.getString("GiaNhap"));
                product.setNhaCungCap(result.getString("NhaCungCap"));
                product.setDob(result.getString("NgayNhap"));
                list.add(product);
            }
            
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

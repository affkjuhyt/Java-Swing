package com.linh.model.database;

import com.linh.mode.Product;
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
public class ProductX  {
    private List<Product> list;
    
    public void input(Product product) {
        
        try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
                    + "INSERT INTO tblQlsp (Id, HoVaTen, TenDangNhap, MatKhau, SoDienThoai, BienSoXe, Email, Khac) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            
            statement.setString(1, product.getId());
            statement.setString(2, product.getHoVaTen());
            statement.setString(3, product.getTenDangNhap());
            statement.setString(4, product.getMatKhau());
            statement.setString(5, product.getSoDienThoai());
            statement.setString(6, product.getBienSoXe());
            statement.setString(7, product.getEmail());
            statement.setString(8, product.getKhac());
            
            statement.executeUpdate();
          
          
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

    public void update(Product product) {
          try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
                    + "UPDATE tblQlsp SET HoVaTen=?, TenDangNhap=?, MatKhau=?, SoDienThoai=?, BienSoXe=?, Email=?, Khac=? WHERE Id=?");
            
            statement.setString(1, product.getHoVaTen());
            statement.setString(2, product.getTenDangNhap());
            statement.setString(3, product.getMatKhau());
            statement.setString(4, product.getSoDienThoai());
            statement.setString(5, product.getBienSoXe());
            statement.setString(6, product.getEmail());
            statement.setString(7, product.getKhac());
//            statement.setString(8, product.getMaHang());
          
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductX.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void delete(String ID) {
          try {
            PreparedStatement statement = ConnectionDatabase.getConnection().prepareStatement(""
                    + "DELETE FROM tblQlsp WHERE Id=?");
            
            statement.setString(1, ID);
            
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductX.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
   
    public List<Product> getProduct(String ID) {
        list = new ArrayList<Product>();
        
        try {
            
            Statement statement = ConnectionDatabase.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM tblQlsp WHERE Id LIKE '%" + ID + "%'");
            
            while (result.next()) { 
                Product product = new Product();
                product.setId(result.getString("Id"));
                product.setHoVaTen(result.getString("HoVaTen"));
                product.setTenDangNhap(result.getString("TenDangNhap"));
                product.setMatKhau(result.getString("MatKhau"));
                product.setSoDienThoai(result.getString("SoDienThoai"));
                product.setBienSoXe(result.getString("BienSoXe"));
                product.setEmail(result.getString("Email"));
                product.setKhac(result.getString("Khac"));
                list.add(product);
            }
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ProductX.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    public List<Product> getAllProduct() {
    list = new ArrayList<Product>();
        
        try {
            
            Statement statement = ConnectionDatabase.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM tblQlsp");
            
            while (result.next()) { 
                Product product = new Product();
                product.setId(result.getString("Id"));
                product.setHoVaTen(result.getString("HoVaTen"));
                product.setTenDangNhap(result.getString("TenDangNhap"));
                product.setMatKhau(result.getString("MatKhau"));
                product.setSoDienThoai(result.getString("SoDienThoai"));
                product.setBienSoXe(result.getString("BienSoXe"));
                product.setEmail(result.getString("Email"));
                product.setKhac(result.getString("Khac"));
                list.add(product);
            }
            
            
            statement.close();
            result.close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ProductX.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

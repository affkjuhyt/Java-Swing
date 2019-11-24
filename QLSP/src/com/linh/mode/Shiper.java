package com.linh.mode;

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
public class Shiper {
    private List<Shiper> list;
    private String id;
    private String hoVaTen;
    private String tenDangNhap;
    private String matKhau;
    private String soDienThoai;
    private String bienSoXe;
    private String email;
    private String khac;

    public List<Shiper> getList() {
        return list;
    }

    public void setList(List<Shiper> list) {
        this.list = list;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKhac() {
        return khac;
    }

    public void setKhac(String khac) {
        this.khac = khac;
    }
    
    public void input(Shiper product) {
        
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
            Logger.getLogger(Shiper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

    public void update(Shiper product) {
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
            Logger.getLogger(Shiper.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Shiper.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
   
    public List<Shiper> getProduct(String ID) {
        list = new ArrayList<Shiper>();
        
        try {
            
            Statement statement = ConnectionDatabase.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM tblQlsp WHERE Id LIKE '%" + ID + "%'");
            
            while (result.next()) { 
                Shiper product = new Shiper();
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
            Logger.getLogger(Shiper.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    public List<Shiper> getAllProduct() {
    list = new ArrayList<Shiper>();
        
        try {
            
            Statement statement = ConnectionDatabase.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM tblQlsp");
            
            while (result.next()) { 
                Shiper product = new Shiper();
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
            Logger.getLogger(Shiper.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}

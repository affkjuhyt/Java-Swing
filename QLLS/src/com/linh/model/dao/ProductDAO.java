package com.linh.model.dao;

import com.linh.mode.Product;
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
public class ProductDAO implements ImplementProduct{
    private List<Product> list;
    
    @Override
    public List<Product> getAllProduct() {
    list = new ArrayList<Product>();
        
        try {
            
            Statement statement = ConnectionDatabase.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM tblLsdh");
            
            while (result.next()) { 
                Product product = new Product();
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
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

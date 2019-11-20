/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linh.model.dao;

import com.linh.mode.Product;
import java.util.List;
/**
 *
 * @author Thien Linh
 */
public interface ImplementProduct {
    public void input(Product product);
    
    public void update(Product product);
    
    public void delete(String ID);
    
    public List<Product> getProduct(String ID);
    
    public List<Product> getAllProduct();
}

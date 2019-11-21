package com.linh.controller;

import com.linh.mode.Product;
import com.linh.model.dao.ImplementProduct;
import com.linh.model.dao.ProductDAO;
import com.linh.model.table.TableModel;
import com.linh.view.PanelForm;
import java.util.List;
/**
 *
 * @author Thien Linh
 */
public class Controller {
    private final PanelForm panel;
    private List<Product> list;
    private final ImplementProduct implementProduct;
    
    public Controller(PanelForm panel) {
        this.panel = panel;
        implementProduct = new ProductDAO();
        list = implementProduct.getAllProduct();
    }
    
    public void isiTabel(){
        list = implementProduct.getAllProduct();
        panel.getjTable1().setModel(new TableModel(list));
        
    }
}

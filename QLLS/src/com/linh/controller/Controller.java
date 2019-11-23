package com.linh.controller;

import com.linh.mode.Product;
import com.linh.model.database.ProductX;
import com.linh.view.PanelForm;
import java.util.List;
/**
 *
 * @author Thien Linh
 */
public class Controller {
    private final PanelForm panel;
    private List<Product> list;
    ProductX p = new ProductX();
    
    public Controller(PanelForm panel) {
        this.panel = panel;
        list = p.getAllProduct();
    }
    
    public void isiTabel(){
        list = p.getAllProduct();
        panel.getjTable1().setModel(new TableModel(list));
        
    }
}

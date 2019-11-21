package com.linh.controller;

import com.linh.model.Product;
import com.linh.model.dao.ImplementProduct;
import com.linh.model.dao.ProductDAO;
import com.linh.model.table.TableModel;
import com.linh.view.PanelForm;
import java.util.List;
import javax.swing.JOptionPane;

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
    
    public void reset(){
        panel.getTxtMaHang().setText("");
        panel.getTxtTenHang().setText("");
        panel.getTxtSoLuong().setText("");
        panel.getTxtGiaBanLe().setText("");
        panel.getTxtGiaBanBuon().setText("");
        panel.getTxtGiaNhap().setText("");
        panel.getTxtNhaCungCap().setText("");
        panel.getTxtNgayNhap().setText("");
        
        
        panel.getjTable1().clearSelection();
    }
    
    public void isiTabel(){
        list = implementProduct.getAllProduct();
        panel.getjTable1().setModel(new TableModel(list));
        
    }
    
    public  void getDataField(){
        
        int row = panel.getjTable1().getSelectedRow();
        
        if (row != -1){
            
            panel.getTxtMaHang().setText(list.get(row).getMaHang());
            panel.getTxtTenHang().setText(list.get(row).getTenHang());
            panel.getTxtSoLuong().setText(list.get(row).getSoLuong());
            panel.getTxtGiaBanLe().setText(list.get(row).getGiaBanLe());
            panel.getTxtGiaBanBuon().setText(list.get(row).getGiaBanBuon());
            panel.getTxtGiaNhap().setText(list.get(row).getGiaNhap());
            panel.getTxtNhaCungCap().setText(list.get(row).getNhaCungCap());
            panel.getTxtNgayNhap().setText(list.get(row).getDob());
        }
       
    }
    
    public void insert(){
        
        Product product = new Product();
        product.setMaHang(panel.getTxtMaHang().getText());
        product.setTenHang(panel.getTxtTenHang().getText());
        product.setSoLuong(panel.getTxtSoLuong().getText());
        product.setGiaBanLe(panel.getTxtGiaBanLe().getText());
        product.setGiaBanBuon(panel.getTxtGiaBanBuon().getText());
        product.setGiaNhap(panel.getTxtGiaNhap().getText());
        product.setNhaCungCap(panel.getTxtNhaCungCap().getText());
        product.setDob(panel.getTxtNgayNhap().getText());
        
        implementProduct.input(product);
    }

    public void update(){
        
        Product product = new Product();
        product.setMaHang(panel.getTxtMaHang().getText());
        product.setTenHang(panel.getTxtTenHang().getText());
        product.setSoLuong(panel.getTxtSoLuong().getText());
        product.setGiaBanLe(panel.getTxtGiaBanLe().getText());
        product.setGiaBanBuon(panel.getTxtGiaBanBuon().getText());
        product.setGiaNhap(panel.getTxtGiaNhap().getText());
        product.setNhaCungCap(panel.getTxtNhaCungCap().getText());
        product.setDob(panel.getTxtNgayNhap().getText());
        
        implementProduct.update(product);
    
    }
    
    public void delete(){
        
        if (panel.getTxtMaHang().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(panel, "No data deleted....? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String MaHang = panel.getTxtMaHang().getText();
        
        implementProduct.delete(MaHang);
        
    }
    
    
    public void getData(){
        
        if (panel.getTxtMaHang().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(panel, "Isi data Nama yang mau di cari....? ", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String MaHang = panel.getTxtMaHang().getText();
        
        implementProduct.getProduct(MaHang);
        isiTabelCari(MaHang);
    }

   public void isiTabelCari(String MaHang){
        
        list = implementProduct.getProduct(MaHang);
        panel.getjTable1().setModel(new TableModel(list));
    }
}

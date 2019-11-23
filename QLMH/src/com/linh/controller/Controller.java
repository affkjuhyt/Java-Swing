package com.linh.controller;

import com.linh.model.Product;
import com.linh.model.database.ProductO;
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
    ProductO p = new ProductO();
    
    public Controller(PanelForm panel) {
        this.panel = panel;
        list = p.getAllProduct();
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
        list = p.getAllProduct();
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
        
        p.input(product);
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
        
        p.update(product);
    
    }
    
    public void delete(){
        
        if (panel.getTxtMaHang().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(panel, "Khong co du lieu de xoa....? ",null, JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String MaHang = panel.getTxtMaHang().getText();
        
        p.delete(MaHang);
        
    }
    
    
    public void getData(){
        
        if (panel.getTxtNama().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(panel, "Dien ten vao du lieu ban muon tim kiem ? ", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String nama = panel.getTxtNama().getText();
        
        p.getProduct(nama);
        isiTabelCari(nama);
    }

   public void isiTabelCari(String MaHang){
        
        list = p.getProduct(MaHang);
        panel.getjTable1().setModel(new TableModel(list));
    }
}

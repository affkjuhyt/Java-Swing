package com.linh.controller;

import com.linh.model.Product;
import com.linh.view.PanelForm;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Thien Linh
 */
public class Controller {
    
    private final PanelForm panel;
    private List<Product> list;
    Product p = new Product();
    
    public class TableModel extends AbstractTableModel {
        private static final long serialVersionUID = 1L;

        List<Product> list ;

        public TableModel(List<Product> list) {
            this.list = list;
        }


        @Override
        public int getRowCount() {
            return list.size();
        }

        @Override
        public int getColumnCount() {
            return 8;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0 : return list.get(rowIndex).getMaHang();
                case 1 : return list.get(rowIndex).getTenHang();
                case 2 : return list.get(rowIndex).getSoLuong();
                case 3 : return list.get(rowIndex).getGiaBanLe();
                case 4 : return list.get(rowIndex).getGiaBanBuon();
                case 5 : return list.get(rowIndex).getGiaNhap();
                case 6 : return list.get(rowIndex).getNhaCungCap();
                case 7 : return list.get(rowIndex).getDob();
                    default:return null;
            }
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0 : return "MaHang";
                case 1 : return "TenHang";
                case 2 : return "SoLuong";
                case 3 : return "GiaBanLe";
                case 4 : return "GiaBanBuon";
                case 5 : return "GiaNhap";
                case 6 : return "NhaCungCap";
                case 7 : return "NgayNhap";

                    default:return null;
            }
        }
    }
    
    
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
        p.setMaHang(nama);
        p.getProduct();
        isiTabelCari(nama);
    }

   public void isiTabelCari(String MaHang){
        
        list = p.getProduct();
        panel.getjTable1().setModel(new TableModel(list));
    }
   
   
}

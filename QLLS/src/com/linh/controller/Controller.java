package com.linh.controller;

import com.linh.mode.History;
import com.linh.view.PanelForm;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Thien Linh
 */
public class Controller {
    private final PanelForm panel;
    private List<History> list;
    History p = new History();
    
    
    public class TableModel extends AbstractTableModel{

    private static final long serialVersionUID = 1L;

    List<History> list ;

    public TableModel(List<History> list) {
        this.list = list;
    }
       
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getMaDonHang();
            case 1 : return list.get(rowIndex).getTenDonHang();
            case 2 : return list.get(rowIndex).getGia();
            case 3 : return list.get(rowIndex).getNgayDatDonHang();
            case 4 : return list.get(rowIndex).getTrangThaiDonHang();
                default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 : return "MaDonHang";
            case 1 : return "TenDonHang";
            case 2 : return "Gia";
            case 3 : return "NgayDatDonHang";
            case 4 : return "TrangThaiDonHang";
            
                default:return null;
        }
    }
}
    
    public Controller(PanelForm panel) {
        this.panel = panel;
        list = p.getAllProduct();
    }
    
    public void isiTabel(){
        list = p.getAllProduct();
        panel.getjTable1().setModel(new TableModel(list));
        
    }
}

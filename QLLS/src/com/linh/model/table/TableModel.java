package com.linh.model.table;

import com.linh.mode.Product;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Thien Linh
 */
public class TableModel extends AbstractTableModel{

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

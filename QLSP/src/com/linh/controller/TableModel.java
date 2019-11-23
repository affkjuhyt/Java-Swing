package com.linh.controller;

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
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getId();
            case 1 : return list.get(rowIndex).getHoVaTen();
            case 2 : return list.get(rowIndex).getTenDangNhap();
            case 3 : return list.get(rowIndex).getMatKhau();
            case 4 : return list.get(rowIndex).getSoDienThoai();
            case 5 : return list.get(rowIndex).getBienSoXe();
            case 6 : return list.get(rowIndex).getEmail();
            case 7 : return list.get(rowIndex).getKhac();
                default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 : return "Id";
            case 1 : return "HoVaTen";
            case 2 : return "TenDangNhap";
            case 3 : return "MatKhau";
            case 4 : return "SoDienThoai";
            case 5 : return "BienSoXe";
            case 6 : return "Email";
            case 7 : return "Khac";
            
                default:return null;
        }
    }
}

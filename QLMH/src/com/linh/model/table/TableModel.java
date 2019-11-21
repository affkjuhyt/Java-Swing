package com.linh.model.table;


import com.linh.model.Product;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Thien Linh
 */
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

package dao;

import java.util.ArrayList;
import model.DanhMuc;

/**
 *
 * @author Thien Linh
 */
public interface DanhMucDAO {
    
    // lay ra danh sach danh muc cha
    public ArrayList<DanhMuc> getListDanhMucCha();

    // lay ra danh sach danh muc con
    public ArrayList<DanhMuc> getListDanhMucCon(String ma_danh_muc);
}

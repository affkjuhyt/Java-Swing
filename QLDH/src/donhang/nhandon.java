/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donhang;

/**
 *
 * @author Thien Linh
 */
public class nhandon {
    int id;
    String diaChi;
    String tenHang;
    String thoiGian;
    String trangThai;
    String khachHang;

    public nhandon(int id, String diaChi, String tenHang, String thoiGian, String trangThai, String khachHang) {
        this.diaChi = diaChi;
        this.tenHang = tenHang;
        this.thoiGian = thoiGian;
        this.trangThai = trangThai;
        this.khachHang = khachHang;
        this.id =id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }


    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(String khachHang) {
        this.khachHang = khachHang;
    }
}

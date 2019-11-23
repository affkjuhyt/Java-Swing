/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Thien Linh
 */
public class bangship {
    int id;
    int idShip;
    ArrayList<nhandon> listHoaDon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdShip() {
        return idShip;
    }

    public void setIdShip(int idShip) {
        this.idShip = idShip;
    }

    public ArrayList<nhandon> getListHoaDon() {
        return listHoaDon;
    }

    public void setListHoaDon(ArrayList<nhandon> listHoaDon) {
        this.listHoaDon = listHoaDon;
    }
    
    
}

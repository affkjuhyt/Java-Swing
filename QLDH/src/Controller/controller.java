/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model.nhandon;

/**
 *
 * @author Thien Linh
 */

public class controller {
    private ArrayList<nhandon> list;
    nhandon p = new nhandon();
    
    public void isiTabel(){
        list = p.loadData();
    }

}

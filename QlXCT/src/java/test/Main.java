/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.DanhMucDAOImpl;

/**
 *
 * @author Thien Linh
 */
public class Main {
    public static void main(String[] args) {
        DanhMucDAOImpl dm = new DanhMucDAOImpl();
        System.out.println(dm.getListDanhMucCha().size());
//        System.out.println(dm.getListDanhMucCon("10001").size());
    }
}
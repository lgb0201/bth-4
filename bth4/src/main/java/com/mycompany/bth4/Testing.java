/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bth4;


public class Testing {

    public static void main(String[] args) {
        QuanLyHinh ql = new QuanLyHinh();
        ql.themHinh(new Circle("C", 2), new TamGiac("TG", 3, 4, 5), new Ellipse("E", 10, 7));
        
        ql.hienThi();
    }
}

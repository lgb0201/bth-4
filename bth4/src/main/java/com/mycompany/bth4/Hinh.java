/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth4;

import java.util.List;

/**
 *
 * @author admin
 */
public abstract class Hinh {
    private String ten;
    
    public Hinh(String ten) {
        this.ten = ten;
    }
    
    public abstract double tinhDienTich();

    @Override
    public String toString() {
        return String.format("%s\nDien tich: %s\n", this.ten, this.tinhDienTich());
    }
    
    public List<Hinh> dsHinhCuThe(Hinh hinh) {
        
    }
    
}

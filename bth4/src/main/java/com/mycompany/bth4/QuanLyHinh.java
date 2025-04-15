/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLyHinh {
    private List<Hinh> ds = new ArrayList<>();
    public void themHinh(Hinh...h) {
        ds.addAll(Arrays.asList(h));
        
    }
    
    public void hienThi() {
        this.ds.forEach(h -> {
            System.out.print(h);
        });
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bth4;

/**
 *
 * @author admin
 */
public class Ellipse extends Hinh{
    private double bkTrucLon;
    private double bkTrucBe;

    public Ellipse(String ten,double bkTrucLon, double bkTrucBe) {
        super(ten);
        this.bkTrucLon = bkTrucLon;
        this.bkTrucBe = bkTrucBe;
    }

   
    @Override
    public double tinhDienTich() {
        return Math.PI * this.bkTrucBe * this.bkTrucLon;
    }

    /**
     * @return the bkTrucLon
     */
    public double getBkTrucLon() {
        return bkTrucLon;
    }

    /**
     * @param bkTrucLon the bkTrucLon to set
     */
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    /**
     * @return the bkTrucBe
     */
    public double getBkTrucBe() {
        return bkTrucBe;
    }

    /**
     * @param bkTrucBe the bkTrucBe to set
     */
    public void setBkTrucBe(double bkTrucBe) {
        this.bkTrucBe = bkTrucBe;
    }


}

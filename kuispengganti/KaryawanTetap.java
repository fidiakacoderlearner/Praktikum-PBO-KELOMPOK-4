/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuispengganti;

/**
 *
 * @author User
 */
public class KaryawanTetap extends Karyawan implements IDapatGaji {
    
    private double gajiBulanan;
    
    public KaryawanTetap(String nama, String NIP, double gajiBulanan){
        super(nama, NIP);
        this.gajiBulanan = gajiBulanan;
    }
    
    public void tampilkanSlipGaji(){
        System.out.println("Nama : " + getNama());
        System.out.println("NIP : " + getNIP());
        System.out.println("Status : Karyawan Tetap");
        System.out.println("Gaji Bulanan : " + getGajiBulanan());
    }

    public double getGajiBulanan() {
        return gajiBulanan;
    }

    public void setGajiBulanan(double gajiBulanan) {
        this.gajiBulanan = gajiBulanan;
    }
    
}

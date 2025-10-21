/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.requiz2;

/**
 *
 * @author ASUS
 */
public class KaryawanTetap extends Karyawan implements IDapatGaji {

    private double gajiBulanan;
    
    public KaryawanTetap(String nama, String NIP, double gajiBulanan) {
        super(nama, NIP);
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public void tampilkanSlipGaji() {
        System.out.println("Nama : " + getNama());
        System.out.println("NIP  : " + getNIP());
        System.out.println("Status : Karyawan Tetap");
        System.out.println("Gaji Bulanan: " + this.gajiBulanan);
    }
    
    
}

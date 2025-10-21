/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.requiz2;

/**
 *
 * @author ASUS
 */
public class KaryawanKontrak extends Karyawan implements IDapatGaji {

    private double upahHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak(double upahHarian, int jumlahHariMasuk, String nama, String NIP) {
        super(nama, NIP);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }
    
    @Override
    public void tampilkanSlipGaji() {
        double totalGaji = this.upahHarian * this.jumlahHariMasuk;
        System.out.println("Nama : " + getNama());
        System.out.println("NIP  : " + getNIP());
        System.out.println("Status : Karyawan Kontrak");
        System.out.println("Total Gaji: " + totalGaji);
    }
    
    
}

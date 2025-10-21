/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuispengganti;

/**
 *
 * @author User
 */
public class KaryawanKontrak extends Karyawan implements IDapatGaji {
    
    private double upahHarian;
    private int jumlahHariMasuk;
    double totalGaji = upahHarian * jumlahHariMasuk;
    
    public KaryawanKontrak(String nama, String NIP, double upahHarian, int jumlahHariMasuk){
        super(nama, NIP);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }
    
    public void tampilkanSlipGaji(){
        System.out.println("Nama : " + getNama());
        System.out.println("NIP : " + getNIP());
        System.out.println("Status : Karyawan Kontrak");
        System.out.println("Total Gaji : " + totalGaji);
    }
    

    public double getUpahHarian() {
        return upahHarian;
    }

    public void setUpahHarian(double upahHarian) {
        this.upahHarian = upahHarian;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public void setJumlahHariMasuk(int jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
    }
    
}

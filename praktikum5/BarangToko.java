/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5;

/**
 *
 * @author ASUS
 */
public class BarangToko {
    String merk;
    String kategori;
    double harga;
    
    public BarangToko(String merk) {
        this.merk = merk + " (Barang Tidak ada)";
        this.kategori = "Tidak ada";
        this.harga = 0.0d;
    }
    
    public BarangToko(String merk, String kategori, double harga) {
        this.merk = merk;
        this.kategori = kategori;
        this.harga = harga; 
    }
    
    public void infoBarang() {
        System.out.println("Nama Barang     : " + this.merk);
        System.out.println("Kategori        : " + this.kategori);
        System.out.println("harga           : " + "Rp." + this.harga);
        System.out.println("==============================================");
    }
    
    public void infoBarang(int infoStok) {
        System.out.println("Nama Barang     : " + this.merk);
        System.out.println("Kategori        : " + this.kategori);
        System.out.println("harga           : " + "Rp." + this.harga);
        System.out.println("Stok Tersisa    : " + infoStok);
        System.out.println("==============================================");
    }
}

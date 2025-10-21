/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum7;

/**
 *
 * @author User
 */
public class Produk implements HargaAkhir {
    
    protected String nama;
    protected int harga;
   
    public Produk(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public void tampilkanInfo(){
        System.out.println("nama : " + nama);
        System.out.println("harga : " + harga);
    }
    
    public double hitungPajak(){
        return harga * 0.05;
    }
    
    @Override
    public double hitungHarga(){
        return harga * 1.05;
    }
    
    
}

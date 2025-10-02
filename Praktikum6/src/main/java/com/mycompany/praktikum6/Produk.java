/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum6;

/**
 *
 * @author user
 */
public class Produk {
    public String nama;
    private double harga;
    protected int stok;
    private final String namaSupplier ="Jefri";
    
    static int jumlahproduk = 0;
    
    public Produk (String nama, double harga, int stok){
        this.nama = nama;
        this.harga= harga;
        this.stok = stok;
        jumlahproduk++;
    }           
    
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double hargaBaru){
        if(hargaBaru > 0){
            this.harga = hargaBaru;
        } else if(hargaBaru == 0){
            this.harga = hargaBaru;
            System.out.println("produk ini gratis");
        } else {
            System.out.println("harga produk tidak boleh negatif.");
        }
    }
    
    private void namaSupplier(){
        System.out.println("nama suppkier " + namaSupplier);
    }
    
    public void namaSupplierFix(){
        namaSupplier();
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("harga: " + harga);
        System.out.println("Stok: " + stok);
    }
    
    public static void infoJumlahProduk(){
        System.out.println("Total produk yang telah dibuat: " + jumlahproduk);
    }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum6;

/**
 *
 * @author User
 */
public class Praktikum6 {

    public static void main(String[] args) {
        
        Produk p1 = new Produk("Laptop", 7000000, 15);
        Produk p2 = new Produk("Handphone", 1500000, 10);
        
        System.out.println(p1.nama);
        System.out.println(p1.stok);
//        System.out.println(p1.harga); //ini akan error
//        p1.namaSupplier(); //ini akan error
        p1.namaSupplierFix();
        p1.tampilkanInfo();
        p2.tampilkanInfo();
        
        System.out.println("Harga : " + p1.getHarga());
        
        p1.setHarga(5000000);
        System.out.println("Harga baru untuk produk 1 : " + p1.getHarga());
        
        Produk.infoJumlahProduk();
        
    }
}

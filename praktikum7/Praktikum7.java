/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum7;

/**
 *
 * @author User
 */
public class Praktikum7 {

    public static void main(String[] args) {
        
        Produk p1 = new Produk("Buku", 150000);
        BarangElektronik p2 = new BarangElektronik("Mouse", 150000, 12);
        
        p1.tampilkanInfo();
        System.out.println("Pajak Produk Biasa : " + p1.hitungPajak());
        System.out.println("Harga Akhir Produk Biasa : " + p1.hitungHarga());
        System.out.println("-----------------------");
        p2.tampilkanInfo();
        p2.tampilkanGaransi();
        System.out.println("Pajak Produk Elektronik : " + p2.hitungPajak());
        System.out.println("Harga Akhir Produk Elektronik : " + p2.hitungHarga());
        
    
    }
}
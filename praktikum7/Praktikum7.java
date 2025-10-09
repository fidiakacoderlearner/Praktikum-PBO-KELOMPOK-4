/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum7;

/**
 *
 * @author user
 */
public class Praktikum7 {

    public static void main(String[] args) {
        Produk p1  = new Produk("pensil", 120000);
        BarangElektronik p2  = new BarangElektronik("mouse", 120000, 10);
        
        p1.tampilkanInfo();
        System.out.println("Pajak produk umum : " + p1.hitungPajak());
        System.out.println("Harga akhir produk : " + p1.hitungHarga());
        System.out.println("---------------");
        p2.tampilkanInfo();
        p2.tampilkanGaransi();
        System.out.println("Pajak barang elektronik: " + p2.hitungPajak());
        System.out.println("Harga akhir produk : " + p2.hitungHarga());
    }
}

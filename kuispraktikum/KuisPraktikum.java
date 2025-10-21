/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kuispraktikum;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KuisPraktikum {

    public static void main(String[] args) {

    
    int umur = 19;
    String nama = "Yosia Sitompul";
    
    System.out.println("Nama saya : " + nama);
    System.out.println("Saya berumur: " + umur);
    
    double belanja = 50000;
    System.out.println("Total belanja: " + belanja + " Diskon 10%");
    System.out.println("Total belanja setelah diskon: " + (belanja * 1/10));
    
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan nama: ");
    String namaSiswa = input.nextLine(); 
    System.out.println("Halo " + namaSiswa + " selamat belajar");  
    
    enum Warna {
        MERAH, HIJAU, BIRU
    }
    for (Warna c : Warna.values()){
    System.out.println(c);
     }
    
    double pi = 3.14;
    System.out.println("1.Persegi");
    System.out.println("2.Lingkaran");
    System.out.println("3.Segitiga");
    System.out.println("Apa yang ingin dihitung?(1-3):");
    int pilihan = input.nextInt();
    switch (pilihan) {
            case 1 :
    System.out.println("Masukkan sisi(cm) : ");
    int sisi = input.nextInt();
    int luasPersegi = sisi * sisi;
    System.out.print("Luas Persegi(cm): " + luasPersegi);
    break;
            case 2:
    System.out.println("Masukkan jari-jari(cm) : ");
    int jari = input.nextInt();
    double luasLingkaran = jari * (pi * pi);
    System.out.println("Luas lingkaran(cm): " + luasLingkaran);
    break;
            case 3:
    System.out.println("Masukkan alas(cm) : ");
    int alas = input.nextInt();
    System.out.println("Masukkan tinggi(cm): ");
    int tinggi = input.nextInt();
    int luasSegitiga = alas * tinggi;
    System.out.println("Luas Segitiga(cm): " + luasSegitiga);
    break;
            default:
                System.out.println("Pilihan tidak tersedia");
    }
    
}
}
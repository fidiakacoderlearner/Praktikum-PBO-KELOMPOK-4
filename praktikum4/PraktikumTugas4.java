/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum4;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PraktikumTugas4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pil;
        String ulang;
        System.out.println("---Kalkulator luas bangun datar---");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("5. Keluar");  
        do {
            System.out.println("===================================================================");
            System.out.print("Masukkan pilihan menu : ");
            pil = input.next();
            switch (pil) {
                case "1" :
                    System.out.print("Masukkan panjang sisi (cm) : ");
                    double sisi = input.nextDouble();
                    double luasPersegi = sisi * sisi;
                    System.out.println("Luas : " + luasPersegi + " cm^2");
                    break;
                case "2" :
                    System.out.print("Masukkan panjang sisi (cm) : ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar sisi (cm) : ");
                    double lebar = input.nextDouble();
                    double luasPersegiPanjang = panjang * lebar;
                    System.out.println("Luas : " + luasPersegiPanjang + " cm^2");
                    break;
                case "3" :
                    System.out.print("Masukkan panjang jari jari (cm) : ");
                    double jari = input.nextDouble();
                    double PI = (jari % 7 == 0) ? (22.0 / 7) : 3.141;
                    double luasLingkaran = PI * jari * jari;
                    System.out.println("Luas : " + luasLingkaran + " cm^2");
                    break;
                case "4" : 
                    System.out.print("Masukkan Panjang alas (cm) : ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan Tinggi (cm) : ");
                    double tinggi = input.nextDouble();
                    double luasSegitiga = alas * tinggi / 2;
                    System.out.println("Luas : " + luasSegitiga + " cm^2");
                    break;
                case "5" :
                    System.out.println("Terimakasih telah menggunakan kalkulator");
                    ulang = "t";
                    continue;
                default :
                    System.out.println("Pilihan tidak ada, Silahkan mengulang kembali");
            }
            System.out.print("Apakah anda ingin menggunakan kalkulator lagi? (Tekan y jika ya) : ");
            ulang = input.next();
        } while (ulang.equals("y") || ulang.equals("Y"));
    }
}

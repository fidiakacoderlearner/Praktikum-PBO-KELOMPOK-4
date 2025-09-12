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
public class Quiz1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //soal 1
        String nama3 = "Fidi";
        int umur = 19;
        System.out.println("Nama " + nama3);
        System.out.println("Umur " + umur);
        
        //soal2
        float totbel = 50000;
        float diskon = totbel / 10;
        float totbay = totbel - diskon;
        System.out.println("Total belanja : " + totbel);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total Bayar " + totbay);
        
        //soal3
        int sks = 24;
        System.out.println("nilai sks : " + sks);
        int sksmin = 12;
        System.out.println("jumlah sks minimal : " + sksmin);
        
        //soal4
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.println("Halo " + nama + ", Selamat belajar Java");
        
        //soal5
        System.out.print("Masukkan berat badan :  ");
        float bb = input.nextFloat();
        System.out.print("Masukkan tinggi badan : ");
        float tb = input.nextFloat();
        float bmi = bb / tb * tb;
        System.out.println("BMI adalah " + bmi);
        
        //soal6
        enum Warna {
            MERAH, HIJAU, BIRU
        }
        
        System.out.println(Warna.MERAH);
        System.out.println(Warna.HIJAU);
        System.out.println(Warna.BIRU);
        
        //soal7
        float PI = 3.141f;
        System.out.println("Menu bangun datar");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("Pilih mau membuat apa : ");
        int pil = input.nextInt();
        if (pil == 1) {
            System.out.print("masukkan sisi (dalam cm): ");
            float sisi = input.nextFloat();
            System.out.println("Luas : " + sisi * sisi + "cm^2" );
        } else if (pil == 2) {
            System.out.print("masukkan jari jari (dalam cm): ");
            float jari = input.nextFloat();
            System.out.println("Luas : " + PI * jari * jari + "cm^2" );
        } else if (pil == 3) {
            System.out.print("masukkan alas (dalam cm): ");
            float pj = input.nextFloat();
            System.out.print("masukkan tinggi (dalam cm): ");
            float lb = input.nextFloat();
            System.out.println("Luas : " + pj * lb / 2 + "cm^2");
        } else {
            System.out.println("pilihan tidak ada");
        }
        
    }
}

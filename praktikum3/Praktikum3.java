/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum3;

import java.util.Scanner;
/**
 *
 * @author Afdhal Fidi Ansori
 */
public class Praktikum3 {

    public static void main(String[] args) {
        int a = 10, b = 2;
        
        //operator aritmatika
        System.out.println("Tambah (+) : " + (a + b));
        System.out.println("Kurang (-) : " + (a - b));
        System.out.println("Kali (*)   : " + (a * b));
        System.out.println("Bagi (/)   : " + (a / b));
        System.out.println("Modulus(%) : " + (a % b));
        
        //operator perbandingan
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        
        //operator logika
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));
        
        //operator assignment
        int i = 10;
        i += 2;
        System.out.println("i += 2 : " + i);
        
        //operator ternary
        int nilai = 40;
        char grade = (nilai >= 80) ? 'A' : (nilai >= 75) ? 'B' : (nilai >= 60) ? 'C' : 'D';
        System.out.println("Grade : " + grade);
        
        //output
        System.out.println("Hello World");
        System.out.println("Baris Kedua");
        System.out.print("Hello ");
        System.out.print("World");
        System.out.println();

        String nama = "fidi";
        String nama2 = "ansori";
        int umur = 19;
        double tinggi = 172.1f;
        
        System.out.printf("Halo nama saya %s %s, umur %d, tinggi %.1f cm\n", nama, nama2, umur, tinggi);
        
        //input scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NIM anda : ");
        String nim = scanner.nextLine();
        System.out.println("Nim anda adalah : " + nim);
        
        System.err.print("Masukkan umur : ");
        try{
            int umurUser = scanner.nextInt();
            System.out.println("Umur : " + umurUser + " tahun");
        } catch (Exception e) {
            System.out.println("Anda salah input");
        }
        
        //
        String strUmur = "19";
        int intUmur = Integer.parseInt(strUmur);
        System.out.println("strUmur yang telah dikonversi : " + intUmur);
        
        int value = 235;
        String strValue = Integer.toString(value);
        System.out.println("intValue yang telah dikonversi : " + strValue);
        
        //enumerasi
        enum Hari {
            SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }
        
        Hari hariIni = Hari.RABU;
        
        if (hariIni == Hari.RABU) {
            System.out.println("Hari ini adalah hari RABU");
            System.out.println("Dan besok adalah hari " + Hari.KAMIS);
        }
    }
}

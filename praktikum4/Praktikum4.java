/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Praktikum4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //if-else
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        if (nilai > 75) {
            System.out.println("Anda lulus ujian");
        } else {
            System.out.println("Anda harus mengulang ujian");
        }
        
        //if-else if-else
        System.out.print("Masukkan nilai : ");
        int nilai1 = input.nextInt();
        if (nilai1 > 75) {
            System.out.println("Anda lulus ujian");
        } else if (nilai1 > 65) {
            System.out.println("Nilai anda berada di ambang batas kelulusan");
        } else {
            System.out.println("Anda harus mengulang ujian");
        }
        
        //swtich case
        System.out.print("Masukkan warna (RGB) : ");
        String warna = input.next();
        switch (warna) {
            case "R":
                System.out.println("Anda memilih warna Merah");
                break;
            case "G":
                System.out.println("Anda memilih warna Hijau");
                break;
            case "B":
                System.out.println("Anda memilih warna Biru");
                break;
            default :
                System.out.println("Warna tidak tersedia");
        }
        
        //nested if
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        if (angka >= 0) {
            System.out.print("Bilangan bernilai positif ");
            
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            } else {
                System.out.println("dan ganjil");
            }
        } else if (angka == 0) {
            System.out.println("Bilangan bernilai netral");
        } else {
            System.out.println("Bilangan bernilai negatif ");
            
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            } else {
                System.out.println("dan ganjil");
            }
        }
        
        //for loop
        for (int a = 1; a <= 5; a++) {
            System.out.println("For Loop ke-" + a);
        }
        
        //while loop
        int b = 1;
        while (b <= 5) {
            System.out.println("While Loop ke-" + b);
            b++;
        }
        
        //do while loop
        int c = 1;
        do {
            System.out.println("Do While Loop ke-" + c);
            c++;
        } while (c <= 5);
        
        //nested loop
        System.out.println("---Mencetak nomor kursi bioskop---");
        char kursi = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(kursi + "" + j + " ");
            }
            System.out.println();
            kursi++;
        }
        
        //break
        for (int d = 1; d <= 10; d++) {
            if (d == 5) {
                System.out.println("Break di angka " + d);
                break;
            }
            System.out.println("Angka: " + d);
        }
        
        //continue
        for (int e = 1; e <= 10; e++) {
            if (e % 2 == 0) {
                continue;
            }
            System.out.println("Bilangan ganjil: " + e);
        }
    }
}
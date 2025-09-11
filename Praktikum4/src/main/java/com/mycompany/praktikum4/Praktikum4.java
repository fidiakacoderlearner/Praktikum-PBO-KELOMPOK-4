/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum4;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Praktikum4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // if else
        System.out.println("Masukkan nilai : ");
        int nilai = input.nextInt();
        if (nilai > 75) {
            System.out.println("Anda lulus ujian");
        } else if (nilai > 65) {
            System.out.println("Nilai anda berada di ambang batas kelulusan");
        } else {
            System.out.println("Anda tidak lulus ujian");
        }

        // switch case
        System.out.println("Masukkan warna (R/G/B): ");
        String warna = input.next();
        switch (warna) {
            case "R":
                System.out.println("Anda memilih warna merah");
                break;
            case "G":
                System.out.println("Anda memilih warna hijau");
                break;
            case "B":
                System.out.println("Anda memilih warna biru");
                break;
            default:
                System.out.println("Warna tidak teresedia");
        }

        // Nested if
        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();
        if (angka > 0) {
            System.out.println("Bilangan bernilai positif");
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            } else {
                System.out.println("dan ganjil");
            }
        } else if (angka < 0) {
            System.out.println("Bilangan bernilai negatif");
            if (angka % 2 == 0) {
                System.out.println("dan genap");
            } else {
                System.out.println("dan ganjil");
            }
        } else {
            System.out.println("Bilangan bernilai nol (netral)");
        }
        
        //Loop
        for (int a = 1; a <= 5; a++) {
            System.out.println("For loop ke-" + a);
        }
        
        //While
        int b = 1;
        while (b <= 5){
            System.out.println("While loop ke-" + b);
            b++;
        }
        
        //Do while
        int c = 6;
        do {
            System.out.println("Do while loop ke-" + c);
            c++;
        } while (c <= 5);
        
        //Nested loop
        char kursi = 'A';
        for (int i = 0; i < 3; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print(kursi + "" + j + " ");
            }
            System.out.println();
            kursi++;
        }
        
        //Control statement
        for (int d = 1; d <= 10; d++) {
            if (d == 5){
                System.out.println("Break di angka " + d);
                break;
            }
            System.out.println("Angka: " + d);
        }
        
        for (int e = 1; e <= 10; e++){
            if (e % 2 == 0){
                continue;
            }
            System.out.println("Bilangan ganjil: " + e);
        }
        
        //Terima kasih
    }
}
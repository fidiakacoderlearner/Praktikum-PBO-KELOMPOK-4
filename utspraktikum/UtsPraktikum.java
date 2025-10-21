/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utspraktikum;
import java.util.*;

/**
 *
 * @author User
 */
public class UtsPraktikum {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Mahasiswa m1 = new Mahasiswa("Yosia", "2407114019", 2024);

        System.out.println("---Selamat datang di StudentApp!---");

        System.out.println("Pilih Menu : ");
        System.out.println("1. Tampilkan BioData");
        System.out.println("2. Hitung umur akademik");
        System.out.println("3. Keluar");

        int pilih = input.nextInt();

        switch(pilih){
            case 1 : m1.tampilkanData();
            case 2 : m1.hitungUmur();
            case 3 : System.out.println("Program selesai");
        }   
      
    }
}

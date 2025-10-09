/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum2;
/**
 *
 * @author Yosia Sitompul
 */
public class Praktikum2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*
        menampilkan nama
        */
        System.out.println("nama saya Ayos");
        
        int umur;
        umur = 19;
        
        String nama = "Yosia Sitompul";
        
        System.out.println("nama saya " + nama);
        System.out.println("umur saya " + umur);
        
        int x = 1, y = 3, z = 5;
        System.out.println(x + " " + y + " " + z);
        
        double[] ipSemester = {3.5, 3.7, 3.9, 4.0};

        System.out.println("ip semester 4 saya adalah : " + ipSemester[3]);
          
        int intSemester1 = (int) ipSemester[0];
        System.out.println("ip semester 1 saya adalah : " + intSemester1);
        
        long nilaiSangatbesar = 3000000000L;
        int intnilaiSangatbesar = (int) nilaiSangatbesar;
        
        System.out.println("nilai long yang belum diubah ke int : " + nilaiSangatbesar);
        System.out.println("nilai long yang sudah diubah ke int : " + intnilaiSangatbesar);
        
        final double PI = 3.14;
        //PI = 3.5;
        System.out.println("Nilai PI = " + PI);
    }
}

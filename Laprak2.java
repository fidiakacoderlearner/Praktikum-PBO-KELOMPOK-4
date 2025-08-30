/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laprak2;

/**
 *
 * @author Ranti
 */
public class Laprak2 {

    public static void main(String[] args) {
        //menampilakan hello world
        System.out.println("Hello World!");
        
        /*
        Menampilkann Nama
        */
        System.out.println("Nama Saya Ranti");
        
        int umur;
        umur=19;
        
        String nama = "asifa miranti";
        
        System.out.println("Nama saya : " + nama);
        System.out.println("Umur : " + umur) ;
        
        int x = 1, y = 3, z = 5;
        System.out.println(x + " " + y + " " + z);
        
        double[] ipSemester = {3.9, 3.7, 4.0, 4.0};
         System.out.println("IP Semester 3 saya adalah : " + ipSemester[0]);
        
        int intSemester1 = (int) ipSemester[0];
        System.out.println("Nilai IP Semester 1 integer : " + intSemester1);
        
        long nilaiSangatBesar = 3000000000l;
        int intNilaiSangatBesar = (int) nilaiSangatBesar;
        
       System.out.println("Nilai Long sebelum di konversi ke int : " + nilaiSangatBesar);
       System.out.println("Nilai Long yang di konversi ke int : " + intNilaiSangatBesar);
       
      final  double  PI = 3.14;
      // PI = 3 
      
    }
}

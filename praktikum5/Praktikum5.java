/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum5;

/**
 *
 * @author user
 */
public class Praktikum5 {

    public static void main(String[] args) {
        
        System.out.println("Hello Word");
        
       Mobil mobilsaya = new Mobil ("Toyota", "Merah", 2025);
       Mobil mobilkedua = new Mobil ("Toyota", "Merah", 2025);
       
       Mobil mobilKetiga = new Mobil();
       
       Kalkulator cal = new Kalkulator();
       
       System.out.println("1 + 10 =" + cal.tambah(1,10));
       System.out.println("1 + 10 =" + cal.tambah(2.4, 3.3));
       
       
       
        
        
        
    }
}

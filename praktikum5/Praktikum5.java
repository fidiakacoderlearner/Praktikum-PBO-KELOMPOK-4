/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum5;

/**
 *
 * @author ASUS
 */
public class Praktikum5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Mobil mobilSaya = new Mobil("Toyota", "Merah", 2025);
        Mobil mobilKedua = new Mobil("Daihatsu", "Hitam", 2019);
        
        Mobil mobilKetiga = new Mobil();
        
        Kalkulator cal = new Kalkulator();
        System.out.println("1 + 10 = " + cal.tambah(1, 10));
        System.out.printf("2,4 + 3,3 = %.1f", cal.tambah(2.4, 3.3));
        
    }
}

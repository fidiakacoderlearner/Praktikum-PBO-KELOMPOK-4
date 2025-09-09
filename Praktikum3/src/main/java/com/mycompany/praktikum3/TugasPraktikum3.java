/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class TugasPraktikum3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
     
        System.out.println("Masukkan panjang : ");
        int panjang = in.nextInt();
        System.out.println("Masukkan lebar : ");
        int lebar = in.nextInt();
        System.out.println("Masukkan tinggi : ");
        int tinggi = in.nextInt();
        
        int volume = panjang * lebar * tinggi;
        System.out.println("Volume (cm) : " + volume);
    
            
    }
}

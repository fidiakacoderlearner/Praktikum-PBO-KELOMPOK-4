/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum3;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PraktikumTugas3 {
    
    public static void main(String[] args){
        
        final double PI = 3.141;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jari jari alas (dalam cm) : ");
        double alas = scanner.nextDouble();
        
        System.out.print("Masukkan Tinggi (dalam cm) : ");
        double tinggi = scanner.nextDouble();
        
        double volume = PI*alas*alas*tinggi/3;
        System.out.printf("Volume : %.2f cm^3", volume );
    }
    
}

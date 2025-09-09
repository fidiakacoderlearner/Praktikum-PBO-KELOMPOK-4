/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasprak2;

/**
 *
 * @author user
 */
public class Tugasprak2 {

    public static void main(String[] args) {
        int umur = 19;
        String nim = "2407111762"; 
        String nama = "Jefri";
        
        double[] ipSemester = {3.5, 4.0, 2.4};
        String alamat = "jl. Melati 2";
        char goldarah = 'B';
        
        // ini biodata saya
        System.out.println("Nama saya" + nama);
        System.out.println("Umur saya" + umur);
        System.out.println("Nim saya" + nim);
        System.out.println("Ip Semester ini " + ipSemester[0]);
        System.out.println("Alamat saya" + alamat);
        System.out.println("Golongan darah saya" + goldarah);
        
        byte konversIp = (byte) ipSemester[0];
        
        System.out.println("Ip semester setelah konversi " + konversIp);
    }
}

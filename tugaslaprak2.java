/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laprak2;

/**
 *
 * @author Ranti
 */
public class tugaslaprak2 {
    
    public static void main(String[] args) {
        String nama = "asifa miranti";
        String nim = "2407110832";
        double[] ipSemester = {3.6, 3.8, 4.0 }; 
        String alamat = "Jl. Bangau Sakti";
        final String UNIVERSITAS = "Universitas Riau";  // Variabel konstan
        int umur = 19;
        String golonganDarah = "AB";
        
        byte[] ipSemesterByte = new byte[ipSemester.length];
        for (int i = 0; i < ipSemester.length; i++) {
            ipSemesterByte[i] = (byte) ipSemester[i];
        }
        
        // Tampilkan data
        System.out.println("Nama             : " + nama);
        System.out.println("NIM              : " + nim);
        System.out.println("Universitas      : " + UNIVERSITAS);
        System.out.println("Alamat           : " + alamat);
        System.out.println("Umur             : " + umur + " tahun");
        System.out.println("Golongan Darah   : " + golonganDarah);

        System.out.println("\nIP per Semester (double):");
        for (int i = 0; i < ipSemester.length; i++) {
            System.out.println("Semester " + (i + 1) + ": " + ipSemester[i]);
        }

        System.out.println("\nIP per Semester (byte - setelah konversi):");
        for (int i = 0; i < ipSemesterByte.length; i++) {
            System.out.println("Semester " + (i + 1) + ": " + ipSemesterByte[i]);
        }
    }
}

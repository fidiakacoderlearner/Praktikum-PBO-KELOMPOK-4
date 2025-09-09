/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum2;

/**
 *
 * @author Ayos
 */
public class Praktikum2 {
    public static void main(String[] args) {
        //inisialisasi nama
        String nama = "Jefri Mulia Rezki";
        //inisialisasi nim
        String nim = "2407111762";
        //inisialisasi ip semester
        double[] ipSemester = {3.5, 3.57, 4.0};
        //inisialisasi alamat
        String alamat = "Jl. Melati II";
        //inisialisasi konstanta
        final double GRAVITASI = 9.8;
        //inisialisasi umur
        int umur = 19;
        //inisialisasi golongan darah
        char golDarah = 'B';
        //ubah ipe data double ke byte
        byte intSemester = (byte) ipSemester[1];
        //Tampilkan semua
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("ip semester 1 : " + ipSemester[0]);
        System.out.println("ip semester 2 : " + ipSemester[1]);
        System.out.println("ip semester 3 : " + ipSemester[2]);
        System.out.println("alamat : " + alamat);
        System.out.println("Gravitasi : " + GRAVITASI);
        System.out.println("umur : " + umur);
        System.out.println("Golongan Darah : " + golDarah);
        System.out.println("ips byte : " + intSemester);
    }
}



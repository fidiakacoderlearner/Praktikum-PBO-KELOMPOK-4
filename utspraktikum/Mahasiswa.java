/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspraktikum;

/**
 *
 * @author User
 */
public class Mahasiswa {

    String nama;
    String NIM;
    int tahunMasuk;
    final int tahunSekarang = 2025;



    enum listProgramStudi {
        S1_TEKNIK_INFORMATIKA, S1_TEKNIK_ELEKTRO, D3_TEKNIK_ELEKTRO, TIDAK_ADA
    }


    public Mahasiswa(){
        nama = "Null";
        NIM = "0000";
        tahunMasuk = 0;
    }

    public Mahasiswa(String nama, String NIM, int tahunMasuk){
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
    }

    public void tampilkanData(){
        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Tahun Masuk : " + tahunMasuk);
    }

    public void hitungUmur(){
        int umurA = tahunSekarang - tahunMasuk;
        System.out.println("Umur akademik : " + umurA);
    }
}


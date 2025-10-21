/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5;

/**
 *
 * @author User
 */
public class Mobil {
    
    String merk;
    String warna;
    int tahunKeluar;
    
    public Mobil() {
        this.merk = "Unknown";
        this.warna = "Putih";
        this.tahunKeluar = 2010;
    }
    
    public Mobil(String merk, String warna, int tahunKeluar) {
        this.merk = merk;
        this.warna = warna;
        this.tahunKeluar = tahunKeluar;
    }
    
    public void infoMobil(){
        System.out.println("Ini mobil dengan merk " + merk + " berwarna " + warna + " keluaran " + tahunKeluar);
    }
    
    public void panaskanMobil(){
        System.out.println("Mobilnya sedang dipanaskan");    
    }
    
    
    
}

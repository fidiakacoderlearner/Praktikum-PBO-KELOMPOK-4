/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5;

/**
 *
 * @author ASUS
 */
public class TugasPraktikum5 {
    public static void main(String[] args) {
        BarangToko mieInstan = new BarangToko("Indomie", "Makanan", 3500);
        BarangToko sampoSachet = new BarangToko("Rejoice", "Alat Mandi", 1000);
        BarangToko rotiTawar = new BarangToko("Sari Roti");
        
        mieInstan.infoBarang(15);
        sampoSachet.infoBarang(120);
        rotiTawar.infoBarang();
    }
}

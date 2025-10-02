/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasprak6;

/**
 *
 * @author user
 */
public class TugasPrak6 {
    public static void main(String[] args) {
        //objek Bank dan Rekening
        Bank bank1 = new Bank("BRI");
        Rekening rek1 = new Rekening("112233", "jefri", 1000000);
        Bank.tampilkanIdBank();
        rek1.tampilkanInfo();
        
        //Pembaruan Info Rekening 
        bank1.setNamaBank("BNI");
        rek1.setId("111222");
        rek1.setNamaPemilik("Mulia");
        rek1.setTambahSaldo(500000);
        rek1.setKurangSaldo(100000);
        
        //Info Rekening Setelah diperbarui
        System.out.println("Nama Bank : " + bank1.getNamaBank());
        System.out.println("ID Pemilik : " + rek1.getId());
        System.out.println("Nama Pemilik : " + rek1.getNamaPemilik());
        System.out.println("Saldo : " + rek1.getSaldo());
    }   
}

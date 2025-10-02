/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasprak6;

/**
 *
 * @author user
 */
public class Rekening {
    private String id;
    private String namaPemilik;
    private double saldo;
    
    public Rekening(String id, String namaPemilik, double saldo) {
        this.id = id;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setTambahSaldo(double saldo){
        if(saldo > 0){
            this.saldo += saldo;
        } else if (saldo == 0){
            System.out.println("Tidak ada perubahan saldo");
        } else {
            System.out.println("Jumlah tidak valid");
        }
    }
    
    public void setKurangSaldo(double saldo){
        if(saldo > 0){
            this.saldo -= saldo;
        } else if (saldo == 0){
            System.out.println("Tidak ada perubahan saldo");
        } else {
            System.out.println("Jumlah tidak valid");
        }
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String idBaru){
        if(idBaru.length() == id.length()) {
            this.id = idBaru;
        }
    }
    
    public String getNamaPemilik(){
        return namaPemilik;
    }
    
    public void setNamaPemilik(String namaPemilikBaru){
        if(namaPemilikBaru.length() > 0) {
            this.namaPemilik = namaPemilikBaru;
        }
    }
    
    public void tampilkanInfo(){
        System.out.println("ID Rekening : " + id);
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Total Saldo : " + saldo);
    }
}

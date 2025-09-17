/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasprak5;

/**
 *
 * @author user
 */
public class Dosen {
    String nama;
    String nipDosen;
    double gaji;
    
    public Dosen(){
        this.nama = "nama dosen";
        this.nipDosen = "nip dosen";
        this.gaji = 0.0000;
    }
    
    public Dosen (String nama, String nipDosen, double gaji){
        this.nama = nama;
        this.nipDosen = nipDosen;
        this.gaji = gaji;
    }
    
    public void infoDosen(){
        System.out.println("Nama Dosen :" + nama + ", Nip Dosen :" + nipDosen + ", gaji dosen :" + gaji);    
    }
    
    public void infoDosen(String tunjangan){
        System.out.println("Nama Dosen :" + nama + ", Nip Dosen :" + nipDosen + ", gaji dosen :" + gaji + "tunjangan :" + tunjangan);
    } 
}

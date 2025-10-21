/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum5;

/**
 *
 * @author User
 */
public class Identitas {
    String nama;
    String agama;
    String nim;
    
    public Identitas() {
        this.nama = "Rahasia";
        this.agama = "Muslim";
        this.nim = "20101222";
    }
    
    public Identitas(String nama, String agama, String nim) {
        this.nama = nama;
        this.agama = agama;
        this.nim = nim;
    }
    
    public void tampilkanInfo(){
        System.out.println("Halo! nama saya " + nama + " saya beragama " + agama + " nim saya " + nim);
    }
    
    public void tampilkanInfo(String salam){
        System.out.println(salam + " Halo! nama saya " + nama + " saya beragama " + agama + " nim saya " + nim);    
    }
}

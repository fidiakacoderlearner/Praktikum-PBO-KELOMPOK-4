/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasprak6;

/**
 *
 * @author user
 */
public class Bank {
    static String idBank = "112233";
    private String namaBank;
    
    public Bank (String namaBank){
        this.namaBank = namaBank;
    }
    
    static void tampilkanIdBank() {
        System.out.println("ID Bank : " + idBank);
    }
    
    public String getNamaBank(){
        return namaBank;
    }
    
    public void setNamaBank(String namaBankBaru) {
        this.namaBank = namaBankBaru;
    }
}

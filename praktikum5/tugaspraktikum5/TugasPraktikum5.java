/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspraktikum5;

/**
 *
 * @author User
 */
public class TugasPraktikum5 {

    public static void main(String[] args) {
        Identitas mahasiswaSatu = new Identitas();
        Identitas mahasiswaDua = new Identitas("Ayos", "Kristen", "2407114019");
        Identitas mahasiswaTiga = new Identitas("Rian", "Buddha", "2407114910");
        
        mahasiswaSatu.tampilkanInfo("Selamat pagi");
        mahasiswaDua.tampilkanInfo("Selamat siang");
        mahasiswaTiga.tampilkanInfo();
    }
}

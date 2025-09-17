/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasprak5;

/**
 *
 * @author user
 */
public class Tugasprak5 {

    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        Dosen dosen2 = new Dosen("Ayos ", "2407114019", 2.000);
        Dosen dosen3 = new Dosen("FIdi", "2407126812", 3.000);
        
        dosen1.infoDosen();
        dosen2.infoDosen();
        dosen3.infoDosen();
    }  
}

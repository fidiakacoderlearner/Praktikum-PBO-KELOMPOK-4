/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.requiz2;

import java.util.List;
/**
 *
 * @author ASUS
 */
public class DemoHRD {

    public static void main(String[] args) {
        
        List<IDapatGaji> objek = List.of(
             new KaryawanTetap("Fidi", "2401", 5000000),
             new KaryawanKontrak(500000d, 30, "Ansori", "2400")
        ); 
        
        for(IDapatGaji i : objek){
            i.tampilkanSlipGaji();
        }
        
        
    }
}

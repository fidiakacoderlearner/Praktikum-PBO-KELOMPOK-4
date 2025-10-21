/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuispengganti;

/**
 *
 * @author User
 */
public class DemoHRD {
    
      public static void main(String[] args) {
        
          KaryawanTetap kt1 = new KaryawanTetap("Ayos", "12345", 4500000);
          KaryawanKontrak kk1 = new KaryawanKontrak("Andre", "12346", 100000, 20);
          
          IDapatGaji[] daftarGaji = new IDapatGaji[2];
          daftarGaji[0] = kt1;
          daftarGaji[1] = kk1;
          
         for (IDapatGaji iDapatGaji : daftarGaji){
             iDapatGaji.tampilkanSlipGaji();
         }
    }
    
}

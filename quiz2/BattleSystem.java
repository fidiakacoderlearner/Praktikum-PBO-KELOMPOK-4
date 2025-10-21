/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.Random;
public class BattleSystem {
    
    public void pertarungan(Enemy e1, Hero p1){
        final Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("=== Pertempuran Dimulai! ===");
        System.out.println(p1.getNama() + " vs " + e1.getNama());
        while (p1.getHp() > 0 && e1.getHp() > 0) {
            System.out.println();
            System.out.println("HP " + p1.getNama() + ": " + p1.getHp());
            System.out.println("HP " + e1.getNama() + ": " + e1.getHp());
            System.out.println("1. Serang");
            System.out.println("2. Gunakan Skill");
            System.out.print("Pilih aksi: ");
            String pilihan = input.nextLine();

            if (pilihan.equals("1")) {
                p1.attack(e1);
            } else if (pilihan.equals("2")) {
                if(p1.hasUseSkill()){
                    p1.useSkill(e1);
                } else {
                    System.out.println("Skill sudah digunakan");
                    continue;
                }
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            if (e1.getHp() > 0) {
                e1.attack(p1);    
            }
        }
        
        
    }
    
                            
}

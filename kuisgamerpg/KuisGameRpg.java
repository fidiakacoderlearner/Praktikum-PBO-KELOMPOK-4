/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kuisgamerpg;
import java.util.*;
/**
 *
 * @author User
 */
public class KuisGameRpg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Enemy e1 = new Enemy ("Goblin", 80, 7, 3);
        
        System.out.println("Selamat datang Player!");

  
        System.out.println("Silahkan pilih role anda!");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");
        
        int pilihRole = input.nextInt();
        
        switch (pilihRole) {
            
        case 1 :
        
        Warrior w1 = new Warrior("Kamu", 100, 10, 7);
        System.out.println("Kamu memilih role 'Warrior' ");
        System.out.println("Stat kamu");
        System.out.println("Health : " + w1.getHp());
        System.out.println("Damage : " + w1.getAtkPower());
        System.out.println("Defend : " + w1.getDefense());
        System.out.println("Goblin muncul dihadapanmu!");
        
        
        break;
        
        case 2 :
        
        Mage m1 = new Mage("Kamu", 80, 20, 2);
        System.out.println("Kamu memilih role 'Mage' ");
        System.out.println("Stat kamu");
        System.out.println("Health : " + m1.getHp());
        System.out.println("Damage : " + m1.getAtkPower());
        System.out.println("Defend : " + m1.getDefense());
        System.out.println("Goblin muncul dihadapanmu!");

        break;
        
        case 3 :
            
        Archer a1 = new Archer("Kamu", 90, 13, 4);
        System.out.println("Kamu memilih role 'Archer' ");
        System.out.println("Stat kamu");
        System.out.println("Health : " + a1.getHp());
        System.out.println("Damage : " + a1.getAtkPower());
        System.out.println("Defend : " + a1.getDefense());
        System.out.println("Goblin muncul dihadapanmu!");

        break;
        
        default :
        System.out.println("Error!");
        }
        
        
        
        
    }
}

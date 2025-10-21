/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspraktikum7;
import java.util.* ;
/**
 *
 * @author User
 */
public class TugasPraktikum7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Warrior p1 = new Warrior("Ayos", 10, 80);
        Goblin g1 = new Goblin("Goblin 1", 5, 100);
        
        System.out.println("Stat awal masing-masing");
        p1.tampilkanInfo();
        System.out.println("---------------");
        g1.tampilkanInfoEnemy();
        System.out.println("---------------");
        
        boolean loopGame = true;
        
        while (loopGame) {
        System.out.println("Your turn!");
        System.out.println("1. Attack Enemy");
        System.out.println("2. Run Away");
        System.out.print("Enter Act (1-2) : ");
        int pilih = input.nextInt();
        
        switch (pilih) {
            
        case 1 :    
        System.out.print("*");p1.playerAttack(g1);
        System.out.println("Stat sekarang");
        if (g1.getHpEnemy() <= 0) {
            System.out.println("Goblin Sudah Dikalahkan!!");
            loopGame = false;
            break;
        }
        g1.tampilkanInfoEnemy();
        System.out.println("---------------");
        System.out.println("*");g1.enemyAttack(p1);
        if (p1.getHpPlayer() == 0) {
            System.out.println("Kamu Sudah Dikalahkan!!");
            loopGame = false;
            break;
        }
        p1.tampilkanInfo();
        break;
        
        case 2 :
        System.out.println("You Choose To Run!!");
        System.out.println("What A Coward LOL!!");
        loopGame = false;
        break;
        
        default :
        System.out.println("Error!!");
        break;
        }
      }
       System.out.println("Game Over!!");
    }
    
}

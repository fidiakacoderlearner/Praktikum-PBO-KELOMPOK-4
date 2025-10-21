/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Quiz2 {

    public static void main(String[] args) {
        BattleSystem b1 = new BattleSystem();
        Scanner input = new Scanner(System.in);
        System.out.println("== Role ==");
        System.out.println("1. Warrior (HP : 100, Damage : 10)");
        System.out.println("2. Mage (HP : 70, Damage : 20)");
        System.out.println("3. Archer (HP : 60, Damage : 25)");
        Hero h1 = null;
        String role;
        do{
            System.out.print("Pilih Role : ");
            role = input.nextLine();
            switch (role) {
                case "1" : 
                    h1 = new Warrior("Warrior", 70, 10, 0);
                break;
                case "2" : 
                    h1 = new Mage("Mage", 70, 20, 0);
                break;
                case "3" :
                    h1 = new Archer("Archer", 60, 25, 0);
                break;
                default:
                    System.out.println("Role tidak ada, silahkan coba lagi");
                break;
            }
        }while(!role.equals("1") && !role.equals("2") && !role.equals("3"));
        Enemy e1 = new Enemy("Enemy", 50, 10, 0);
        b1.pertarungan(e1, h1);
        if (e1.getHp() <= 0) {
            System.out.println("Kamu mengalahkan " + e1.getNama() + "!");
        } else {
            System.out.println("Kamu dikalahkan oleh " + e1.getNama() + "!");
        }
    }
}

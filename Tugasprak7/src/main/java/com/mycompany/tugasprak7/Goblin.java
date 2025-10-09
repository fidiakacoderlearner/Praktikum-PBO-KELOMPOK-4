/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasprak7;

/**
 *
 * @author user
 */
import java.util.Random;
public class Goblin extends Enemy{
    private final Random random = new Random();
    
    public Goblin(String nama, int hp, int baseDamage){
        super(nama, hp, baseDamage);
    }
    
    @Override
    public void attack(Player p){
        boolean chanceDamage = random.nextInt(100) < 5;
        int totalDamage = getBaseDamage();
        if(chanceDamage){
            totalDamage += totalDamage;
        }
        p.setHp(p.getHp() - totalDamage);
        System.out.println(getNama() + " Menyerang " + p.getNama() + " dengan damage " + totalDamage);
        System.out.println("Sisa HP " + p.getNama() + " : " + p.getHp());
    }
}

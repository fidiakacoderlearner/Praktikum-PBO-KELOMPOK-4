/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author ASUS
 */
import java.util.Random;
public class Mage extends Hero {
    private final Random random = new Random();
    public Mage(String nama, int hp, int attackPower, int defense) {
        super(nama, hp, attackPower, defense);
    }

    @Override
    public void useSkill(Enemy e) {
        System.out.println("Menggunakan Skill");
        int totalDamage = getAttackPower();
        if(random.nextInt(10) < 0){
            System.out.println("Melakukan Sihir besar sebesar 3 kali damage normal");
            totalDamage = 3 * getAttackPower();
        } else {
            System.out.println("Gagal menggunakan skill");
        }
        e.takeDamage(totalDamage);
        setHp(getHp() - 5);
    }

    @Override
    public void defend() {
        super.defend(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void attack(Hero h) {
        super.attack(h); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void takeDamage(int dmg) {
        super.takeDamage(dmg); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void attack(Enemy e) {
        super.attack(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}

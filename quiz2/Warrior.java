/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author ASUS
 */
public class Warrior extends Hero {

    public Warrior(String nama, int hp, int attackPower, int defense) {
        super(nama, hp, attackPower, defense);
    }

    @Override
    public void useSkill(Enemy e) {
        System.out.println("Hero Menggunakan Skill");
        int totalDamage = 2 * getAttackPower();
        e.takeDamage(totalDamage);
        setHp(getHp() - 5);
        System.out.println("Memberikan damage sebesar " + totalDamage + " dan hp berkurang sebesar 5hp");
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

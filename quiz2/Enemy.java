/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author ASUS
 */
public class Enemy extends Character implements Attackable {

    public Enemy(String nama, int hp, int attackPower, int defense) {
        super(nama, hp, attackPower, defense);
    }

    @Override
    public void attack(Hero h) {
        System.out.println("Enemy menyerang hero dengan damage " + getAttackPower());
        h.takeDamage(getAttackPower());
    }

    @Override
    public void takeDamage(int dmg) {
        if (getDefense() > 0) {
            int sisaDef = getDefense() - dmg;
            if (sisaDef >= 0) {
                setDefense(getDefense() - dmg);
                if(getDefense() < 0){
                    setDefense(0);
                }
                System.out.println("Sisa Defense " + getNama() + " : " + getDefense());
            } else {
                setDefense(0);
                int sisaDamage = -sisaDef;
                setHp(getHp() - sisaDamage);
                System.out.println("defense habis!, " + getNama() + " Menerima " + sisaDamage);
                System.out.println("Sisa HP " + getNama() + " : " + getHp());
            }
        } else {
            setHp(getHp() - dmg);
        }
    }
    
    @Override
    public void attack(Enemy e){
        
    }
    
    public void defend(){
        setDefense(5);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author ASUS
 */
public class Hero extends Character implements Attackable {

    public Hero(String nama, int hp, int attackPower, int defense) {
        super(nama, hp, attackPower, defense);
    }

    @Override
    public void attack(Enemy e) {
        System.out.println("Hero Menyerang dengan damage " + getAttackPower());
        e.takeDamage(getAttackPower());
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
    public void attack(Hero h) {
        
    }
    
    public void defend(){
        setDefense(5);
    }
    
    public void useSkill(Enemy e){
        System.out.println("Menggunakan Skill");
    }
    
    public boolean hasUseSkill(){
        int useSkill = 1;
        if(useSkill == 1){
            return true;
        }
        useSkill = 0;
        return false;
    }
    
}

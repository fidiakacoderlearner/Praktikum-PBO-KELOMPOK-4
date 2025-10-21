/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuisgamerpg;

/**
 *
 * @author User
 */
public class Enemy extends Character implements Attackable{
    
    public Enemy(String name, double hp, double atkPower, double defense){
        super(name, hp, atkPower, defense);
    }
    
    @Override
    public void attack(Character c){
        System.out.println("Archer menyerang dan memberikan " + getAtkPower() + " damage");
        c.setHp(c.getHp() - getAtkPower());
        System.out.println("Health " + c.getName() + " tersisa " + c.getHp());
    }
    
    @Override
    public void takeDmg(Character d){
        System.out.println("Enemy menerima " + d.getAtkPower() + " damage");
        setHp(getHp() - (d.getAtkPower() - getDefense()));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuisgamerpg;

/**
 *
 * @author User
 */
public class Warrior extends Hero implements Attackable{
    
    public Warrior(String name, double hp, double atkPower, double defense){
        super(name, hp, atkPower, defense);
    }
    
    @Override
    public void attack(Character Enemy){
        System.out.println("Warrior menyerang dan memberikan " + getAtkPower() + " damage");
        Enemy.setHp(Enemy.getHp() - getAtkPower());
        System.out.println("Health " + Enemy.getName() + " tersisa " + Enemy.getHp());
    }
    
    @Override
    public void takeDmg(Character Enemy){
        System.out.println("Warrior menerima " + Enemy.getAtkPower() + " damage" );
        setHp(getHp() - (Enemy.getAtkPower() - getDefense()));
    }
    
    @Override
    public void useSkill(){
        
    }
    
}

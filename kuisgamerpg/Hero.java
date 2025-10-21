/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuisgamerpg;

/**
 *
 * @author User
 */
public class Hero extends Character implements Attackable {
    
    public Hero(String name, double hp, double atkPower, double defense){
        super(name, hp, atkPower, defense);
    }
    
    @Override
    public void attack(Character e){
    }
    
    @Override
    public void takeDmg(Character Enemy){
    }
    
    public void defend(){
        
    }
    
    public void useSkill(){
        
    }
    
    
}

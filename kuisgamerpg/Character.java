/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuisgamerpg;

/**
 *
 * @author User
 */
public abstract class Character {
    
    private String name;
    private double hp;
    private double atkPower;
    private double defense;

    public Character(String name, double hp, double atkPower, double defense){
        this.name = name;
        this.hp = hp;
        this.atkPower = atkPower;
        this.defense = defense;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAtkPower() {
        return atkPower;
    }

    public void setAtkPower(double atkPower) {
        this.atkPower = atkPower;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }
    
    
    
}

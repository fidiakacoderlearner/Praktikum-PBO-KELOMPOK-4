/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author ASUS
 */
public interface Attackable {
    public void attack(Enemy e);
    public void takeDamage(int dmg);
    public void attack(Hero h);
}

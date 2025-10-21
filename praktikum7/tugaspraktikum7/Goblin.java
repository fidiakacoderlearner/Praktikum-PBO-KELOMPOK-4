/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum7;

/**
 *
 * @author User
 */
public class Goblin extends Enemy{
   
    public Goblin(String namaEnemy, double dmgEnemy, double hpEnemy){
        super(namaEnemy, dmgEnemy, hpEnemy);
    }
    
    @Override
    public void tampilkanInfoEnemy(){
        System.out.println("Stat Enemy :");
        System.out.println("Nama : " + getNamaEnemy());
        System.out.println("Damage : " + getDmgEnemy());
        System.out.println("Hp : " + getHpEnemy());
    }
    
    @Override
    public void enemyAttack(Player p){
        System.out.println("goblin menyerang dan memberikan " + getDmgEnemy() + " damage");
        p.setHpPlayer(p.getHpPlayer() - getDmgEnemy());
    }
    

  
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum7;

/**
 *
 * @author User
 */
public class Enemy {
    
    private String namaEnemy;
    private double dmgEnemy;
    private double hpEnemy;

    public Enemy(String namaEnemy, double dmgEnemy, double hpEnemy) {
        this.namaEnemy = namaEnemy;
        this.dmgEnemy = dmgEnemy;
        this.hpEnemy = hpEnemy;
    }
    
  
    
    public void tampilkanInfoEnemy(){
        System.out.println("Stat Enemy :");
        System.out.println("Nama : " + namaEnemy);
        System.out.println("Damage : " + dmgEnemy);
        System.out.println("Hp : " + hpEnemy);
    }
    
    public void enemyAttack(Player p){
        System.out.println("Enemy menyerang dan memberikan " + dmgEnemy + " damage");
        p.setHpPlayer(p.getHpPlayer() - this.dmgEnemy);
    }

    public String getNamaEnemy() {
        return namaEnemy;
    }

    public void setNamaEnemy(String namaEnemy) {
        this.namaEnemy = namaEnemy;
    }

    public double getDmgEnemy() {
        return dmgEnemy;
    }

    public void setDmgEnemy(double dmgEnemy) {
        this.dmgEnemy = dmgEnemy;
    }

    public double getHpEnemy() {
        return hpEnemy;
    }

    public void setHpEnemy(double hpEnemy) {
        this.hpEnemy = hpEnemy;
    }
    
    

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasprak7;

/**
 *
 * @author user
 */
public class Enemy {
    private String nama;
    private int hp;
    private int baseDamage;
    
    public Enemy(String nama, int hp, int baseDamage){
        this.nama = nama;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getHp(){
        return this.hp;
    }   
    
    public int getBaseDamage(){
        return this.baseDamage;
    } 
    
    public void setNama(String namaBaru){
        this.nama = namaBaru;
    }
    
    public void setHp(int hpBaru){
        this.hp = hpBaru;
    }   
    
    public void setBaseDamage(int BaseDamage){
        this.baseDamage = BaseDamage;
    }   
    
    public void attack(Player p){
        p.setHp(p.getHp() - this.baseDamage);
        System.out.println(this.nama  + " Menyerang " + p.getNama() + " dengan damage " + this.baseDamage);
        System.out.println("Sisa HP " + p.getNama() + " : " + p.getHp());
    }
}

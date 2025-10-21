/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum7;

/**
 *
 * @author User
 */
public class Player {
    
    private String nama;
    private double dmgPlayer;
    private double hpPlayer;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getDmgPlayer() {
        return dmgPlayer;
    }

    public void setDmgPlayer(double dmgPlayer) {
        this.dmgPlayer = dmgPlayer;
    }
    
    
    public Player(String nama, double dmgPlayer, double hpPlayer){
        this.nama = nama;
        this.dmgPlayer = dmgPlayer;
        this.hpPlayer = hpPlayer;
    }
    
    public void tampilkanInfo(){
        System.out.println("Stat Player :");
        System.out.println("Nama : " + nama);
        System.out.println("Damage : " + dmgPlayer);
        System.out.println("Hp : " + hpPlayer);
    }
    
    public void playerAttack(Enemy e){
        System.out.println("Player menyerang dan memberikan " + dmgPlayer + " damage");
        e.setHpEnemy(e.getHpEnemy() - this.dmgPlayer);
    }

    public double getHpPlayer() {
        return hpPlayer;
    }

    public void setHpPlayer(double hpPlayer) {
        this.hpPlayer = hpPlayer;
    }
    

}

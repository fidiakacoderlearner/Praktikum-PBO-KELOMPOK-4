/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum7;
import java.util.Random;
/**
 *
 * @author User
 */
public class Warrior extends Player {
    private Random random = new Random();
    
    public Warrior (String nama, double dmgPlayer, double hpPlayer){
        super(nama, dmgPlayer, hpPlayer);
    }
    
    @Override
    public void playerAttack(Enemy e){
        boolean chance = random.nextInt(100) < 10;
        if (chance) {
            setDmgPlayer(getDmgPlayer() + 0.7 * getDmgPlayer()) ;
            setHpPlayer(getHpPlayer() + 5);
        }
        System.out.println("Warrior menyerang dan memberikan " + getDmgPlayer() + " damage");
        e.setHpEnemy(e.getHpEnemy() - getDmgPlayer());
    }
   
}

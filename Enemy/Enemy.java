/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemy;

import Enemy.*;
import java.util.*;
import Hero.*;
import Weapons.*;
import Fight.*;

public class Enemy {
    
    // DECLARE VARIABLES
    protected int health;
    protected int dexterity;
    protected int strength;
    protected int xp;
    
    protected int damage;
    
    Weapon hand = new Weapon();
    
    public Enemy(){
        
    }
    
    public int getDamage() {
        return strength + hand.getDamage();
    }


    public Weapon getHand() {
        return hand;
    }

    // getters and setters
    public void setHand(Weapon hand) {    
        this.hand = hand;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health += health;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    
    
   
}

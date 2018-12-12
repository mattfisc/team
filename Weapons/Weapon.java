/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weapons;

public class Weapon {
    // DECLARE VARIABLES
    protected int damage;
    protected int range;
    protected int durability;
    

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
    
    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public int getDurability() {
        return durability;
    }

    
    // CONSTRUCTOR
    public Weapon(){
        
    }
}

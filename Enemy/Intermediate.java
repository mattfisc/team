/*
 * By:     Matthew Fischer
 * Date:   
 */
package Enemy;

import Enemy.*;
import java.util.*;
import Hero.*;
import Weapons.*;
import Fight.*;

public class Intermediate extends Enemy{
    
    public Intermediate(){
        health = 20;
        damage = 8;
        dodge = .15;
        accuracy = .75;
        xp = 55;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDodge(double dodge) {
        this.dodge = dodge;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public double getDodge() {
        return dodge;
    }

    public double getAccuracy() {
        return accuracy;
    }
}

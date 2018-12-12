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

public class Hard extends Enemy{
    
    public Hard(){
        health = 30;
        damage = 10;
        dodge = .25;
        accuracy = .9;
        xp = 75;
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

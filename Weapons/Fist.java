/*
 * By:     Matthew Fischer
 * Date:   
 */
package Weapons;

import Weapons.Weapon;

/**
 *
 * @author Matthew Fischer
 */
public class Fist  extends Weapon{
    
    //CONTSTRUCTOR
    public Fist(int damage){
        this.damage = damage;
        range = 1;
        durability = 100;
    }
}

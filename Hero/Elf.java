/*
 * By:     Matthew Fischer
 * Date:   
 */
package Hero;

import Weapons.Fist;
import Weapons.Weapon;

/**
 *
 * @author Matthew Fischer
 */
public class Elf  extends Player{

    public Elf() {
        hand = new Fist(strength);
        health = 80;
        dodge = .8;
        accuracy = .9;
        strength = 1;
    }

    
    
}

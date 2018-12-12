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
public class Dwarf  extends Player{

    public Dwarf() {
        hand = new Fist(strength);
        health = 150;
        dodge = .2;
        accuracy = .8;
        strength = 3;
    }

    
}

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
        hand = new Fist();
        level = 1;

        health = 7;
        dexterity = 11;
        strength = 7;
    }

    
    
}

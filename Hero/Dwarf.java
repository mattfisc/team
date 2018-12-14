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
        hand = new Fist();
        level = 1;
        
        health = 12;
        dexterity = 6;
        strength = 10;
    }

    
}

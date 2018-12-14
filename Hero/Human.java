/*
 * By:     Matthew Fischer
 * Date:   
 */
package Hero;

import Enemy.*;
import java.util.*;
import Hero.*;
import Weapons.*;
import Fight.*;

public class Human extends Player{

    
    public Human() {
        hand = new Fist();
        level = 1;
        
        health = 8;
        dexterity = 8;
        strength = 8;
        
        meleeDamage = strength + hand.getDamage();
        rangeDamage = dexterity + hand.getDamage();
        
    }

    
}

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

public class Basic extends Enemy{
    
    // CONSTRUCTOR
    public Basic(){
        health = 10;
        dexterity = 5;
        strength = 5;
        
        xp = 10;
        hand = new Fist();
        damage = strength + hand.getDamage();
    }

    
}

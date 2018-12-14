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
        health = 40;
        dexterity = 8;
        strength = 8;
        
        xp = 50;
        hand = new Axe();
        damage = strength + hand.getDamage();
    }

    
}

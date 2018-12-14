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
        dexterity = 6;
        strength = 6;
        
        xp = 25;
        hand = new Sword();
        damage = strength + hand.getDamage();
    }

    
}

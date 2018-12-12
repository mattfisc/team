/*
 * By:     Matthew Fischer
 * Date:   
 */
package Fight;

import Enemy.*;
import java.util.*;
import Hero.*;
import Weapons.*;
import Fight.*;
import static Hero.Player.in;

public class Fight {
    
    // Data members
    boolean fight = true;
    double heroAc;
    double enemyAc;
    int heroAttack;
    int enemyAttack;
    Player hero1;
    Enemy enemy1;
    
    
    public Fight(Player hero,Enemy enemy){
        heroAc = hero.getAccuracy();
        
        
        
        // battle
        while(fight == true){
            
            // hero attack
            if(accuracy(heroAc) == true){
                
                // hero damage
                heroAttack = rollDamage(hero.getHand().getDamage());
                
                // enemy health decreases
                
            }    
            
            // enemy attack
            //if(accuracy(enemyAc)){
            
            //}
            
            // Continue fight check
            fleeOrFight();
            
            
        }
        

    }
    // hit or miss
    public boolean accuracy(double accur){
        boolean hitChance = true;
        
        if(accur > Math.random()){
            hitChance = false;
        }
        
        return hitChance;
            
    }
    
    // flee choice
    public void fleeOrFight(){
        // Declare Variables
        fight = true;
        String answer = "";
        
        System.out.println("If you want to run away enter 'Y' to keey fighting"
                + "or any key to keep fighting.");
        
        // answer to character and lowercase
        answer = in.next().toLowerCase();
        if(answer.charAt(0) == 'y'){
            fight = false;
        }
        
    }
    
    // damage roll
    public int rollDamage(int damage){
        return (int)Math.random() * damage + 1;
    }
    
}

/*
 * By:     Matthew Fischer
 * Date:   
 */
package Fight;

import Enemy.*;
import java.util.*;
import Hero.*;
import Weapons.*;
import static Hero.Player.in;

public class Fight {
    
    // Data members
    boolean fight = true;
    

    int heroAttack;
    int enemyAttack;
    
    Player hero;
    Enemy enemy;
    
    
    public Fight(Player hero,Enemy enemy){
        this.hero = hero;
        this.enemy = enemy;
        
        // battle
        while(fight == true){
            
            // hero attack
            if(hitChance(hero.getDexterity()) == true){
                
                // hero damage roll
                heroAttack = roll( hero.getHand().getDamage() );
                
                // enemy health minus damage roll
                enemy.setHealth(-heroAttack);
            }    
            
            // enemy attack
            if(hitChance(enemy.getDexterity() ) == true){
                
                // enemy attack
                enemyAttack = roll( enemy.getStrength() + enemy.getDamage());
                
                // hero health damage damage roll
                hero.setHealth(-enemyAttack);
            }
            
            // display damage
            System.out.println("");
            System.out.println("Hero damage: " + heroAttack);
            System.out.println("Enemy damage: " + enemyAttack);
            
            // display health
            System.out.println("Hero health: " + hero.getHealth() );
            System.out.println("Enemy health: " + enemy.getHealth() );
            
            
            // Continue fight check
            fleeOrFight();
            
            
        }
        

    }
    // hit or miss
    public boolean hitChance(int dexterity){
        boolean hitChance = true;
        
        if(hero.getDexterity() < (int)(Math.random() * (dexterity + 1)) ){
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
    public int roll(int damage){
        return (int)(Math.random() * (damage + 1) );
    }
    
}

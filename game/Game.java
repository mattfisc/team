/*
 * role playing game
 */
package game;

/**
 *
 * @author Matthew Fischer
 */

import Enemy.*;
import java.util.*;
import Hero.*;
import Weapons.*;
import Fight.*;


public class Game 
{
    Random rnd = new Random();
    public static Scanner in = new Scanner(System.in);

    
    
    public static void main(String[] args) 
    {
        Game wholeGame = new Game();
        boolean levelCheck = false;
        
        // Create Player
        System.out.println("Creating Player");
        Player hero = new Player();
        
        
        // Introduce Race Abilities
        Player.raceInfo();
        
        // Choose Player
        int choice = Player.choosePlayer();
        
        // Create Player
        hero = Player.createPlayer(hero,choice);

        // NAME PLAYER
        System.out.println("Enter a name for the player");
        hero.setName( in.nextLine() );
        
        // STORY BEGINS
        System.out.println(hero.getName() + ", you are walking home, but the "
                + "road has many enemies.  Lets see how many you can kill.  "
                + "Your fists are the only thing you have to protect you.");
        
        
        hero.displayHeroAbilities(hero);
        
        
        
        Enemy e = new Basic();
        
        System.out.println("hero total damage " + hero.getMeleeDamage());
        // fight
        Fight f1 = new Fight(hero,e);
        
        
    }

}

/**
 *
 * @author Matthew Fischer
 */

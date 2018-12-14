
package Hero;

import Enemy.*;
import java.util.*;
import Hero.*;
import Weapons.*;
import Fight.*;


public class Player {
    
    //DECLARE VARIABLES
    public static Scanner in = new Scanner(System.in);
    protected String name;

    protected int health;
    protected int dexterity;
    protected int strength;
   
    
    
    protected int meleeDamage;
    protected int rangeDamage;

    protected int level;
    protected int xp;
    
    
   
    // weapons
    Weapon hand = new Weapon();
    Weapon[] belt = new Weapon[2];
    
    // CONSTRUCTOR
    public Player(){
        
    }
    
    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health * 10;
    }

    public void setHealth(int health) {
        this.health += health;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMeleeDamage() {
        return meleeDamage;
    }

    public int getRangeDamage() {
        return rangeDamage;
    }

    public void setRangeDamage(int rangeDamage) {
        this.rangeDamage = rangeDamage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Weapon getHand() {
        return hand;
    }

    public void setHand(Weapon hand) {
        this.hand = hand;
    }

    public Weapon[] getBelt() {
        return belt;
    }

    public void setBelt(Weapon[] belt) {
        this.belt = belt;
    }
    
    
    
    public void raiseLevel(Player hero){
        System.out.println("\nEnter a number");
        System.out.println("Choose to increase: Health, Dexterity, Strength");
        System.out.println("1: Increase Health by 1 for 10 Health.  "
        + "Your health points are " + hero.health);
        System.out.println("2: Increase Dexterity by 1.  "
        + "Your dexterity points are " + hero.dexterity);
        System.out.println("4: Increase Strength by 1.  "
        + "Your Strength points are " + hero.strength);
                
        
        int choice = in.nextInt();
        switch(choice){
            case 1:
                hero.health += 1;
                break;
            case 2:
                hero.dexterity += 1;
                break;
            case 3:
                hero.strength += 1;
                break;
            default:
                System.out.println("upgrade error");
        }

    }
    
    public static Player createPlayer(Player hero, int choice){
        
        
        switch(choice){
            
            case 1:
                hero = new Human();
                break;
            case 2:
                hero = new Elf();
                break;
            case 3:
                hero = new Dwarf();
                break;
            default:
                System.out.println("Error creating hero");
        }
        
        return hero;
    }
    
    public static int choosePlayer(){
        
        System.out.println("Enter 1: to choose Human.");
        System.out.println("Enter 2: to choose Elf.");
        System.out.println("Enter 3: to choose Dwarf.");
        
        int choice = in.nextInt();
        return choice;
    }
    
    public void levelCheck(boolean check,Player hero){
        
        if( hero.getXp() > 100 * hero.getLevel() ){
            hero.setLevel(1);
            hero.raiseLevel(hero);
        }
    }
    
    public static void raceInfo(){
        System.out.println("You may choose between 3 races.\n");
        Player h1 = new Human();
        Player h2 = new Elf();
        Player h3 = new Dwarf();
        
        // human ability list
        System.out.println("Human Abilities:\n-Health: " + h1.getHealth());
        System.out.println("-Dexterity: " + h1.getDexterity());
        System.out.println("-Strength: " + h1.getStrength());
        System.out.println("");
        
        // elf ability list
        System.out.println("Elf Abilities:\n-Health: " + h2.getHealth());
        System.out.println("-Dexterity " + h2.getDexterity());
        System.out.println("-Strength: " + h2.getStrength());
        System.out.println("");
        
        // dwarf ability list
        System.out.println("Dwarf Abilities:\n-Health: " + h3.getHealth());
        System.out.println("-Dexterity: " + h3.getDexterity());
        System.out.println("-Strength: " + h3.getStrength());
        System.out.println("");
        
    }

    // output your hero abilities
    public void displayHeroAbilities(Player hero){
        //check
        System.out.println( "Your Health is " + hero.getHealth() );
        System.out.println( "Your Dexterity ability is " + hero.getDexterity());
        System.out.println( "Your Strength ability is " + hero.getStrength());
    }
}

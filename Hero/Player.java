
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
    protected double dodge;
    protected double accuracy;
    protected int level;
    protected int xp;
    protected int strength;

    
   
    // weapons
    Weapon hand = new Weapon();
    Weapon[] belt = new Weapon[2];
    
    // CONSTRUCTOR
    public Player(int strength){
        level = 1;
    }
    public Player(){
        
    }
    
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDodge(double dodge) {
        this.dodge = dodge;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public void setBelt(Weapon[] belt) {
        this.belt = belt;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public Weapon[] getBelt() {
        return belt;
    }

    // GETHEALTH
    public int getHealth(){
        return health;
    }
    // SETHEALTH
    public void setHealth(int health){
        this.health = health;
    }
    // GETDODGE
    public double getDodge(){
        return dodge;
    }
    // SETDODGE
    public void setDodge(int dodge){
        this.dodge = dodge;
    }
    // GETHAND
    public Weapon getHand(){
        return hand;
    }
    // SETHAND
    public void setHand(Weapon w1){
        hand = w1;
    }
    // GETBELT
    public Weapon getBelt(int x){
        return belt[x];
    }
    // SETBELT
    public void setBelt(Weapon w1,int position){
        belt[position] = w1;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
    
    
    
    public void raiseLevel(Player hero){
        System.out.println("\nEnter a number");
        System.out.println("Choose to increase: Health, Dodge, or Accuracy");
        System.out.println("1: Increase health by 10");
        System.out.println("2: Increase Dodge by 1%");
        System.out.println("3: Increase Accuracy by 5%");
        System.out.println("4: Increase Strength by 2%");
                
        
        int choice = in.nextInt();
        switch(choice){
            case 1:
                hero.health += 10;
                break;
            case 2:
                hero.dodge += .01;
                break;
            case 3:
                hero.accuracy += .05;
                break;
            default:
                System.out.println("upgrade error");
        }

    }
    
    public static Player createPlayer(int choice){
        Player hero = new Player(99);
        
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
        System.out.println("Human Abilities:\n-health: " + h1.getHealth());
        System.out.println("-dodge: " + h1.getDodge()*100 + "%");
        System.out.println("-accuracy: " + h1.getAccuracy()*100 + "%");
        System.out.println("-strength: " + h1.getStrength());
        System.out.println("");
        
        // elf ability list
        System.out.println("Elf Abilities:\n-health: " + h2.getHealth());
        System.out.println("-dodge: " + h2.getDodge()*100 + "%" );
        System.out.println("-accuracy: " + h2.getAccuracy()*100 + "%" );
        System.out.println("-strength: " + h2.getStrength());
        System.out.println("");
        
        // dwarf ability list
        System.out.println("Dwarf Abilities:\n-health: " + h3.getHealth());
        System.out.println("-dodge: " + h3.getDodge()*100 + "%" );
        System.out.println("-accuracy: " + h3.getAccuracy()*100 + "%" );
        System.out.println("-strength: " + h3.getStrength());
        System.out.println("");
        
    }

    // output your hero abilities
    public void displayHeroAbilities(Player hero){
        //check
        System.out.println( "Your health is " + hero.getHealth() );
        System.out.println( "Your dodge ability is " + hero.getDodge()*100 + "%" );
        System.out.println( "Your accuracy ability is " + hero.getAccuracy()*100 + "%" );
    }
}

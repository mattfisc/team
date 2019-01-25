/*
 * By:     Matthew Fischer
 * Date:   01/23/2019
 */
package blackjackapp;

import java.util.ArrayList;
import java.util.Scanner;


public class BlackJackEngine {
    // Data Members
    Deck myDeck;
    Scanner in = new Scanner(System.in);
    ArrayList<Card> playerHand;
    ArrayList<Card> dealerHand;
    
    // Default Constructor
    public BlackJackEngine(){
        // Create Deck
        myDeck = new Deck();
        
        
        
    }

    // Hit me
    public boolean hitMe(){
        boolean hit = false;
        String answer = "";
        
        System.out.println("Do you want another card? HIT or STAY");
        answer = in.next().toLowerCase();
        
        // repeat til answer is in parameters
        while(!answer.equals("hit") || !answer.equals("stay")){
            if(answer.equals("hit")){
                hit = true;
            }
        }
        
        return hit;
    }
    
    // ----- playGame -------
    public void playGame(){
        // Start Game
        // Populate Cards in Deck
        myDeck.populate();
        // Shuffle Cards in Deck
        myDeck.shuffle();
        
        // Player gets two cards
        playerHand.add( myDeck.dealCard() );
        playerHand.add( myDeck.dealCard() );
        
        // Show Players Hand
        System.out.println("Player's  hand value: " + getHandValue(playerHand));
        showHand(playerHand);
        
        // Dealer gets two cards 
        playerHand.add( myDeck.dealCard() );
        playerHand.add( myDeck.dealCard() );
        // Show Dealers Hand
        System.out.println("The dealer's hand is: ");
        showHand(playerHand);

        // Repeat hit me until end of game
        
        
        // End of Game
        
    }
    
    // callWinner
    public void callWinner(ArrayList<Card> playerHand,ArrayList<Card> dealerHand){
        
    }
    
    // getHandValue
    public int getHandValue(ArrayList<Card> hand){
        int value = 0;
        
        for(int i = 0; i < hand.size(); i++){
            value += hand.get(i).value();
        }
        
        return value;
    }
    
    // showHand
    public void showHand(ArrayList<Card> hand){
        
        for( int i = 0; i < hand.size(); i++ ){
            if( hand.get(i).isFaceUp() == false)
                System.out.println( "\t" + hand.get(i).toString() );
            else
                System.out.println("Card (isFaceDown)");
                        
        }
    }
    
}

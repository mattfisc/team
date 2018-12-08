
package oopsprac;

public class Oopsprac {

    public static void main(String[] args) {

        // intialize deck array
        Card[] deck = new Card[52];
        Card[] hand = new Card[5];
        
        // assign deck a card
        assignDeck(deck);
        
        // shuffle deck
        shuffle(deck);
        
        //assign hand of 5 cards
        get5Cards(hand,deck);
        
        
        // output hand
        output(hand);
    }
    
    // ---------------Method assignDeck----------------------
    public static void assignDeck(Card[] deck){
        for(int i = 0; i < 52; i++){

            int suit = i / 13;
            int rank = i % 13;

            deck[i] = new Card(suit,rank);
        }
    }
    
    //-------------------- Output ----------------
    public static void output(Card[] c){
        for(int i = 0; i < c.length-1; i++){
            System.out.println( c[i].getRank() + " of " + c[i].getSuit() );
        }
    }
    
    //------------- Shuffle -------------------------
    public static void shuffle(Card[] deck){
        for(int i = 0; i < deck.length; i++){
            
            int mix1 = (int)(Math.random() * deck.length);
            int mix2 = (int)(Math.random() * deck.length);
            
            Card temp = deck[mix1];
            deck[mix1] = deck[mix2];
            deck[mix2] = temp;
        }
    }
    
    //---------------- get5cards -----------------------
    public static void get5Cards(Card[] hand, Card[] deck){
        
        for(int i = 0; i < hand.length-1; ){
            
            int rnd = (int)(Math.random() * 52);
            
            // take card out of deck
            if(deck[rnd] != null){
                hand[i] = deck[rnd];
                deck[rnd] = null;
                i++;
            }
        }
    }
}


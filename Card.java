
package oopsprac;


public class Card {
    // CONSTATANT VARIABLES DECLARED
    public static final int SPADE = 1;
    public static final int DIAMOND = 2;
    public static final int CLUB = 3;
    public static final int HEART = 4;

    // VARIABLES DECLARED
    private int suit;
    private int rank;
    public final Card[][] deck = new Card[4][14];
    
    public Card(int s, int r){
        suit = s;
        rank = r;
    }
    
    public Card(){
        
    }
    
    public int getRank(){
        return rank;
    }
    public void setRank(int r){
        rank = r;
    }
    public int getSuit(){
        return suit;
    }
    public void setSuit(int s){
        suit = s;
    }
    public String toString(){
        String strSuit = Integer.toString(suit);
        return strSuit;
    }
//    public void initializeDeck(){
//        for(int i = 1; i <= deck.length; i++){
//            for(int j = 1; j <= deck[i].length; j++){
//                deck[i][j] = new Card(i,j);
//            }
//        }
//    }
    public void setDeckOfCards(){
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 14; j++){
                deck[i][j] = new Card(i,j);
            }
        }
    }
    
}

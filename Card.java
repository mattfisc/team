
package oopsprac;


public class Card {
    // CONSTATANT VARIABLES DECLARED
    public static final int SPADE = 0;
    public static final int DIAMOND = 1;
    public static final int CLUB = 2;
    public static final int HEART = 3;

    // VARIABLES DECLARED
    private int suit;
    private int rank;
    
    
    
    
    public Card(int s, int r){
        suit = s;
        rank = r;
    }
    
    public String getSuit(){
        String strSuit = "";
        
        switch(suit){
            case 0:
                strSuit = "Spade";
                break;
            case 1:
                strSuit = "Diamond";
                break;
            case 2: 
                strSuit = "Club";
                break;
            case 3:
                strSuit = "Heart";
                break;
            default:
                strSuit = "Error suit";
        }
        
        return strSuit;
    }
    
    public String getRank(){
        String strRank = "";
        switch(rank){
            case 0:
                strRank = "Ace";
                break;
                
            case 10:
                strRank = "Jack";
                break;
                
            case 11:
                strRank = "Queen";
                break;
                
            case 12:
                strRank = "King";
                break;
            default:
                strRank += rank;
        }
        
        return strRank;
    }
  
}

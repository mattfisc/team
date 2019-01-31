/*
 * By:     Matthew Fischer
 * Date:   01/31/2019
 */
package typingtutormain;

public class TypingTutorMain {

    
    public static void main(String[] args) throws Exception{
        
        TextingTutorEngine tutor = new TextingTutorEngine();
        tutor.setTestSentence("I like cold french fries, Aya!");

        tutor.start();
    }
    
}

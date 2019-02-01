/*
 * By:     Matthew Fischer
 * Date:   01/30/2019
 */
package mainbignum;


public class BigNumber {
        
    // Data Members
    private String number;
    
    // constructor
    public BigNumber(String num){
        number = num;
    }
    
    //******* Getters and Setters ********

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    
    
    
    //******************* Methods **********************
    
    //---- add -------------
    public void add(BigNumber sec){
        String total = "";
        
        // THIS.NUMBER is longer
        if( this.number.length() > sec.number.length() ){
            // add "0" to sec string
            while( this.number.length() > sec.number.length() )
                sec.setNumber("0" + number);
        }
        else{
            // SEC.NUMBER is longer
            // add "0" to this string
            while( this.number.length() < sec.number.length() )
                this.setNumber("0" + number); 
        }
        
        // combine strings
        for(int i = this.getNumber().length() -1; i >= 0; i--){
            
            // convert string to number
            int remainder = 0;
            int thisNum= this.getNumber().charAt(i) - '0';
            int secNum = sec.getNumber().charAt(i) - '0';
            
            
            // calculate num
            int position = 0;
            

            position = (remainder + thisNum + secNum) % 10;
            remainder = (remainder + thisNum + secNum) / 10;

            // add together
            total = position + total;
            // roll over added to next
        }
        
        // change BigNumber
        this.setNumber(total);
        
    }
}

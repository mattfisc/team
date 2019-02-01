/*
 * By:     Matthew Fischer
 * Date:   01/30/2019
 */
package mainrec;

/**
 *
 * @author Matthew Fischer
 */
public class Square extends Rectangle{
    
    public Square(double x){
        super(x,x);
        name = "Square";
    }
    
    //********** Methods **************
    
    // ----- area ------
    @Override
    public double area(){
        return length   * 2;
    }
    
    // ---- parameter -------
    @Override
    public double perimeter(){
        return length * 4;
    }
}

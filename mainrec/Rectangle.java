/*
 * By:     Matthew Fischer
 * Date:   01/30/2019
 */
package mainrec;

/**
 *
 * @author Matthew Fischer
 */
public class Rectangle {
    // Data Members
    protected String name;
    protected double length;
    protected double width;
    
    // Constructor
    public Rectangle(double l, double w){
        name = "Rectangle";
        length = l;
        width = w;
    }
    
    //************** Methods ********************8
    
    //-------- area -----------
    public double area(){
        return length * width;
    }
    
    // ------ parameter --------
    public double perimeter(){
        return length * 2 + width * 2;
    }
}

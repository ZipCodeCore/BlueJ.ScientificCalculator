
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//The class is using mxparser;

import org.mariuszgromada.math.mxparser.*;

public class Calculator
{
    
    
    Double currentValue;
    String mode;
    
    //trig

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        // initialise instance variables
        currentValue=0.0;
        //int y = 0;
        mode ="radians";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    //The calc function
    public  String calc(String toCalc)
    {
        
        Expression expression = new Expression(toCalc);
       
        
        if (mXparser.checkIfDegreesMode()){
            
          mXparser.setDegreesMode(); 
        }
        
        else {
            
            mXparser.setRadiansMode(); 
            
        }
        currentValue=expression.calculate();
        String result= ""+this.currentValue;
        
        return result;
        
        
    }
    
}


/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import  java.lang.Math;
public class Operations
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Calculator
     */
    public Operations()
    {
        // initialise instance variables
        x = 0;
    }

    
 
    
    /**
     * TODO Write comments
     */
    public int squareMethod(int x)
    {
        // put your code here
        return x * x;
        
    }
    
    public double squareRootMethod(int x)
    {
        // put your code here
        return Math.sqrt(x);
        
    }
    public double inverseMethod(int x)
    {
        // put your code here
        return (1/x);
        
    }
    
    public double sineMathMethod(int x)
    {
        // put your code here
        return (Math.sin(x));
        
    }
    
    public double cosMathMethod(int x)
    {
        // put your code here
        return (Math.cos(x));
        
    }
    
    public double tanMathMethod(int x)
    {
        // put your code here
        return (Math.tan(x));
        
    }
    public double invSineMathMethod(int x)
    {
        // put your code here
        return (Math.asin(x));
        
    }
    
    public double invCosMathMethod(int x)
    {
        // put your code here
        return (Math.acos(x));
        
    }
    
    public double invTanMathMethod(int x)
    {
        // put your code here
        return (Math.atan(x));
        
    }
    
    public long factorialMethod(int x){
        
        long result = 1;

        for (int factor = 2; factor <= x; factor++) {
            result *= factor;
        }

        return result;
    }
    
   
}

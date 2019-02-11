
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import  java.lang.Math;

public class Calculator
{
    // instance variables - replace the example below with your own
    private Double x;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        // initialise instance variables
        x = 0.0;
    }

    
    /**
     * TODO Write comments
     */
    public Double squareMethod(Double x)
    {
        // put your code here
        return x * x;
        
    }
    
    public Double add(Double x,Double y)
    {
        return (x+y);
    }
    
    public Double sub(Double x,Double y)
    { 
        return x - y;
    }

    public Double multiply(Double x,Double y)
    {
        return (x*y);
    }
    
    public Double div(Double x,Double y)
    {
        return (Double)(x/y);
    }
    public Double squareRootMethod(Double x)
    {
        // put your code here
        return Math.sqrt(x);
        
    }
    
    public Double invertMethod(Double x)
    {
        // put your code here
        x=-x;
        return x;
        
    }
    public Double exponentiationMethod(Double x,Double y)
    {
        // put your code here
        return Math.pow(x,y);
        
    }
    
    public Double inverseMethod(Double x)
    {
        // put your code here
        return 1/(Double)x;
        
    }
    
    public Double sineMathMethod(Double x)
    {
       Double radians = Math.toRadians(x);

     
      return  (Math.sin(radians));
        
    }
    
    public Double cosMathMethod(Double x)

   {
        Double radians = Math.toRadians(x);
        // put your code here
        return (Math.cos(radians));
        
    }
    
    public Double tanMathMethod(Double x)
    {
        Double radians = Math.toRadians(x);
        // put your code here
        return (Math.tan(radians));
        
    }
    public Double invSineMathMethod(Double x)
    {
       //Double radians = Math.toRadians(x);
        
       return (Math.asin(x));
        
    }
    
    public Double invCosMathMethod(Double x)
    {
        Double radians = Math.toRadians(x);
        // put your code here
        return (Math.acos(radians));
        
    }
    
    public Double invTanMathMethod(Double x)
    {
        //Double radians = Math.toRadians(x);
        // put your code here
        return (Math.atan(x));
        
    }
    
    public long factorialMethod(Double x){
        
        long result = 1;

        for (int factor = 2; factor <= x; factor++) {
            result *= factor;
        }

        return result;
    }
    
    public String toBinary(int x)
    {
        String binary =Integer.toBinaryString( x );
        return binary;
    }
    
    public String toOctal(int x)
    {
        String octal =Integer.toOctalString( x );
        return octal;
    }
    
    /*public String tofloat (int x)
    {
        String fl =Integer.floatValue( x );
        return fl;
    }
*/    
    public String toHexadecimal(int x)
    {
        String hexa =Integer.toHexString( x );
        return hexa;
    }
}

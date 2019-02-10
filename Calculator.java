
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import  java.lang.Math;

public class Calculator extends MainApplication
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        // initialise instance variables
        x = 0;
    }

    
    /**
     * TODO Write comments
     */
    public double squareMethod(int x)
    {
        // put your code here
        return x * x;
        
    }
    
    public double add(double x,double y)
    {
        return (x+y);
    }
    
    public double sub(double x,double y)
    { if(x>y)
        {
        return (x-y);
    }
    return 0;
    }

    public double multiply(double x,double y)
    {
        return (x*y);
    }
    
    public double div(double x,double y)
    {
        return (double)(x/y);
    }
    public double squareRootMethod(int x)
    {
        // put your code here
        return Math.sqrt(x);
        
    }
    
    public double invertMethod(int x)
    {
        // put your code here
        x=-x;
        return x;
        
    }
    public double exponentiationtMethod(int x,int y)
    {
        // put your code here
        return Math.pow(x,y);
        
    }
    
    public double inverseMethod(int x)
    {
        // put your code here
        return 1/(double)x;
        
    }
    
    public double sineMathMethod(double x)
    {
       double radians = Math.toRadians(x);

     
      return  Math.sin(radians);
        
    }
    
    public double cosMathMethod(double x)

   {
        double radians = Math.toRadians(x);
        // put your code here
        return (Math.cos(radians));
        
    }
    
    public double tanMathMethod(double x)
    {
        double radians = Math.toRadians(x);
        // put your code here
        return (Math.tan(radians));
        
    }
    public double invSineMathMethod(double x)
    {
       double radians = Math.toRadians(x);
        // put your code here
        return (Math.asin(radians));
        
    }
    
    public double invCosMathMethod(double x)
    {
        double radians = Math.toRadians(x);
        // put your code here
        return (Math.acos(radians));
        
    }
    
    public double invTanMathMethod(double x)
    {
        double radians = Math.toRadians(x);
        // put your code here
        return (Math.atan(radians));
        
    }
    
    public long factorialMethod(int x){
        
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

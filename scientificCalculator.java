
/**
 * Write a description of class scientificCalculator here.
 *
 * @author William Xu
 * @version 2/9/19
 */
public class scientificCalculator
{
    // instance variables - replace the example below with your own
    private static boolean isRadians = false;

    /**
     * Constructor for objects of class scientificCalculator
     */
    public static void main(String[] args)
    {
        
    }
    
    
    // Methods
    
    /**
     * Switch display mode (binary, octal, decimal, hexadecimal)
     */
    
    
    /**
     * switchDisplayMode() should rotate through the options
     */
    
    
    /**
     * switchDisplayMode(String mode) should set the display to the mode given
     */
    
    
    /**
     * 
     * Memory - Store up to one numeric value in memory for recall later (default to 0) *
     * (M+ key) Add the currently displayed value to the value in memory (store in memory and update display) *
     * (MC key) Reset memory *
     * (MRC key) Recall the current value from memory to the display *
     * Trig functions
    /** 
     * Sine - Calculate the sine of the displayed value and display it
     */
    
    public double sin(double input1) {
        double output = isRadians == false ? Math.sin(Math.toRadians(input1)) : Math.sin(input1);
        return output;
    }
    
    /**
     * Cosine - Calculate the cosine of the displayed value and display it
     */
    
    public double cos(double input1) {
        double output = isRadians == false ? Math.cos(Math.toRadians(input1)) : Math.cos(input1);
        return output;
    }
    
    /**
     * Tangent - Calculate the tangent of the displayed value and display it
     */
    
    public double tan(double input1) {
        double output = isRadians == false ? Math.tan(Math.toRadians(input1)) : Math.tan(input1);
        return output;
    }
    
    /**
     * Inverse Sine
     */
    
    public double arcsin(double input1) {
        double output = isRadians == false ? Math.toDegrees(Math.asin(input1)) : Math.asin(input1);
        return output;
    }
    
    /**
     * Inverse Cosine
     */
    
    public double arccos(double input1) {
        double output = isRadians == false ? Math.toDegrees(Math.acos(input1)) : Math.acos(input1);
        return output;
    }
    
    /**
     * Inverse Tangent
     */
    
    public double arctan(double input1) {
        double output = isRadians == false ? Math.toDegrees(Math.atan(input1)) : Math.atan(input1);
        return output;
    }
    
    /*
     * Switch trig units mode (Degrees, Radians)
     */
    /**
     * switchUnitsMode() should rotate through the options
     */
    
    public void switchUnitsMode(){
        isRadians = !isRadians;
        String newMode = isRadians ? "Radians" : "Degrees";
        System.out.println("Units Mode is Set to " + newMode);
    }
    
    /**
     * switchUnitsMode(String mode) should set the trig units to the type given
     */
    
    public void switchUnitsMode(String mode){
        if (mode.toLowerCase().equals("radian") || mode.toLowerCase().equals("radians")) {
            isRadians = true;
            System.out.println("Units Mode is Set to Radians");
        }
        else if (mode.toLowerCase().equals("degree") || mode.toLowerCase().equals("degrees")) {
            isRadians = false;
            System.out.println("Units Mode is Set to Degrees");
        }
        else {System.out.println("Invalid Type. Rad/Deg Mode Unchanged");}
    }
}

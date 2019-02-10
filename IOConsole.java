import java.util.Scanner;

/**
 * Write a description of class IOConsole here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IOConsole
{
    // instance variables - replace the example below with your own
    //private int x;

    /**
     * Constructor for objects of class IOConsole
     */
    public IOConsole()
    {
        // initialise instance variables
        //x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void display()
    {
        // put your code here
        Calculator c= new Calculator();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your numbers and operators to calculate");
        String s = scanner.next();
        System.out.print(c.calc (s));
        //System.out.print('\u000C');
        
        
        
        
    }
}

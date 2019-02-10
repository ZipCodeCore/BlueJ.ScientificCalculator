
import java.util.Scanner;
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hello
{
    private IOConsole inputOutput;
    
    public Hello(){
        inputOutput = new IOConsole();
    }
    
    public void start(){
        Double num1 = inputOutput.getDoubleInput("Give me a number");
        Double num2 = inputOutput.getDoubleInput("Give me another number");
        String operations = inputOutput.getStringInput("What operations would you like use?");
        
        Double result = 0.0;
        inputOutput.println(result);
    }
}

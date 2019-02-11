import java.util.Scanner;
public class MainApplication {
    private IOConsole inputOutput;
    public MainApplication(){
        
        inputOutput = new IOConsole();
    }
    
    public static void main(String[] args) {
        
    }
    
    public void start(){
        Double num1 = inputOutput.getDoubleInput("Give me a number");
        Double num2 = inputOutput.getDoubleInput("Give me another number");
        String operations = inputOutput.getStringInput("What operations would you like use?");
        
        Double result = 0.0;
        inputOutput.println(result);
    }
    }


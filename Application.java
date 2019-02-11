public class Application {
    
    public Application() {
    
    }
    
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        IOConsole console = new IOConsole();
        Processor processor = new Processor();
        String result = "";
        String numConvert = "";


        boolean quit = false;
        // Hello 
        console.println("Hi!");
        while(!quit) {
            
            // String input = console.getStringInput("Would you like to change the display?");
            // if (input.matches("yes")){
            //     String viewDisplayinput = console.getStringInput("Would you like to view display options"); 
            //     if(viewDisplayinput.matches("yes")) {
            //         processor.displayMode("display");
            //     } else {
            //         String mode = console.getStringInput("Enter Mode:");
            //         processor.displayMode(mode);
            //         Integer x = console.getIntegerInput("Enter x");
            //         numConvert = processor.changeMode(mode, x);
            //         console.println(numConvert);
            //         // enter y
            //         Integer y = console.getIntegerInput("Enter y");
            //         numConvert = processor.changeMode(mode, y);
            //         console.println(numConvert);
            //     }
            // }

            
            // enter operator
            String operator = console.getStringInput("Enter operator");
            
            boolean isValid = isValid(operator);
            if(!isValid) {
                run();
            } else {
                if(operator.matches("inverse|square|invert|!|sqrt|sin|asin|cos|acos|tan|atan|")){
                Double x = console.getDoubleInput("Enter x");
                result = processor.arithmetic(operator, x, 0.0);    
            } else {
                // enter x
                Double x = console.getDoubleInput("Enter x");
                // enter y
                Double y = console.getDoubleInput("Enter y");
                result = processor.arithmetic(operator, x, y);
            }
            
        }
        // print result
            console.println(result);
            
            console.println("Would you like to do more Math????");
            console.println("Enter: yes to continue.");
            String redo = console.getStringInput("Enter: no to quit.");

            // More math?
            if(redo.equals("no")) {
                quit = true;
            } else {
                console.clearScreen();
                quit = false;
            }
            
               
        }
        // bye!
    }
    public static boolean  isValid(String operation) {
        String[] operations = {"-", "/", "*", "^", "+" , "inverse" , "square" ,  "invert" ,  "!" , "sqrt",  "sin" , "asin" , "cos" ,  "acos" , "tan" , "atan"};
        for(int i= 0; i < operations.length-1; i++) {
            if(operations[i].equals(operation)) {
                return true;
            } 
        }
        return false;
    }
    
    
}


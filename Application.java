public class Application {
    
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        IOConsole console = new IOConsole(System.in, System.out);
        Processor processor = new Processor();
        String result = "";
        String numConvert = "";


        boolean quit = false;
        
        // Hello 
        console.println("Hello");
        while(!quit) {
            
            console.println("Would you like to change the display?");
            String input = console.getStringInput();
            if (input.matches("yes")){
                console.println("Would you like to view display options"); 
                String viewDisplayinput = console.getStringInput();
                if(viewDisplayinput.matches("yes")) {
                    processor.displayMode("display");
                } else {
                    console.println("Enter Mode:");
                    String mode = console.getStringInput();
                    processor.displayMode(mode);
                    console.println("Enter x");
                    Double x = console.getDoubleInput();
                    numConvert = processor.changeMode(mode, x);
                    console.println(numConvert);
                    // enter y
                    console.println("Enter y");
                    Double y = console.getDoubleInput();
                    numConvert = processor.changeMode(mode, y);
                    console.println(numConvert);
                }
            }
            // enter x
            console.println("Enter x");
            Double x = console.getDoubleInput();
            // enter operator
            console.println("Enter operator");
            String operator = console.getStringInput();
            // enter y
            console.println("Enter y");
            Double y = console.getDoubleInput();
            
            result = processor.arithmetic(operator, x, y);
            // print result
            console.log(result);
            
            console.println("Would you like to do more Math????");
            console.println("Enter: yes to continue.");
            console.println("Enter: no to quit.");

            // More math?
            String redo = console.getStringInput();
            if(redo.equals("no")) {
                quit = true;
            }   
        }
        // bye!
    }
}


public class Application {
    
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        IOConsole console = new IOConsole(System.in, System.out);
        Processor processor = new Processor();

        boolean quit = false;
        
        // Hello 
        console.println("Hello");
        while(!quit) {
            // enter x
            console.println("Enter x");
            Double x = console.getDoubleInput();
            // enter operator
            console.println("Enter operator");
            String operator = console.getStringInput();
            // enter y
            console.println("Enter y");
            Double y = console.getDoubleInput();
            
            processor.arithmetic(operator, x, y);
            // print result
            // More math?
            String redo = console.getStringInput();
            if(redo.equals("no")) {
                quit = true;
            }   
        }
        console.println("bye!");
        // bye!
    }
}


public class Calculator {
    
    public static void main(String[] args) {
    	run();
    }

    public static run() {
    	Console console = new Console(System.in, System.out);
    	Operations operations = new Operations();
    	Logic processor = new Logic();

    	boolean quit = false;
   		// Hello 
		while(!quit) {
			// enter x
			int x = console.input();
			// enter operator
			String operator = console.input();
			// enter y
			int y = console.input();
			
			processor.arithmetic(operator, x, y)
			// print result
			// More math?
			String redo = console.input();
			if(redo.equals("no")) {
				quit = true;
			}	
		}
		// bye!
	}
}


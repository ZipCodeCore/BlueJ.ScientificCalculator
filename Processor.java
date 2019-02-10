public class Processor {
    
    private static Calculator operations;
    private static IOConsole console;
    
    public Processor() {
        operations = new Calculator();
        console = new IOConsole(System.in, System.out);
    }

    // display method that ask the user what they want to do and shows possible operations including display mode which switches to binary octal decimal hexadecimal
    public static String changeMode(String mode, Double x, Double y) {
    	String result = "";
    	if(mode.matches("binary")){
            Integer binaryX = (Integer) x;
            Integer BinaryY = (Integer) y;
            result += operations.toBinary(x);
            result += operations.toBinary(y);
        } else if(mode.matches("octal")){
            Integer octalX = (Integer) x;
            Integer octalY = (Integer) y;
            result += operations.toOctal(x,y);
            result += operations.toOctal(y);
        } else if(mode.matches("decimal")){
            Integer decimalX = (Integer) x;
            Integer decimalY = (Integer) y;
            result += operations.toDecimal(x);
            result += operations.toDecimal(y);
        } else if (mode.matches("hexadecimal")){
            Integer hexadecimalX = (Integer) x;
            Integer hexadecimalY = (Integer) y;
            result += operations.toHexadecimal(x,y);
            result += operations.toHexadecimal(y);
        }
        return result;
    }

    public static void displayMode(String operator) { 
        if(operator.equals("display")) {
            console.println("Display Mode:");
            console.println("binary"); 
            console.println("octal"); 
            console.println("decimal"); 
            console.println("hexadecimal");
        }
    }
    
    public static String arithmetic(String operator, Double x, Double y) {
        String result = "";
        switch(operator.toLowerCase()) {

        case "+": result+= operations.add(x,y);
        break;

        case "-": result+= operations.subtract(x,y);
        break;
        
        case "/": result+= operations.divide(x,y);
        break;

        case "%": result+= operations.remainder(x,y);
        break;

        case "*": result+= operations.mulit(x,y);
        break;

        case "^": result+= operations.exponentiation(x,y);
        break;
        
        case "inverse": result+= operations.inverse(x);
        break;

        case "square": result+= operations.square(x);
        break;
        
        case "invert": result+= operations.invert(x,y);
        break;

        case "factorial": result+= operations.factorial(x);
        break;
        
        case "switchSign": result+= operations.switchSign(x);
        break;

        case "sqrt": result+= operations.sqrt(x);
        break;
        
        case "sine": result+= operations.sine(x,y);
        break;

        case "asin": result+= operations.asin(x,y);
        break;

        case "cos": result+= operations.cos(x,y);
        break;

        case "acos": result+= operations.acos(x,y);
        break;

        case "tan": result+= operations.tan(x,y);
        break;

        case "atan": result+= operations.atan(x,y);
        break;

        case "quit": result = "bye!";
        break;
        }
        return result;
    }
}
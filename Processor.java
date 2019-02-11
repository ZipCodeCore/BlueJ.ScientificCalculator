public class Processor {
    
    private static Calculator operations;
    private static IOConsole console;
    
    public Processor() {
        operations = new Calculator();
        console = new IOConsole(System.in, System.out);
    }

    // display method that ask the user what they want to do and shows possible operations including display mode which switches to binary octal decimal hexadecimal
    public static String changeMode(String mode, int num) {
    	String result = "";
    	if(mode.matches("binary")){
            Integer binaryNum = (Integer) num;
            result += operations.toBinary(num);
        } else if(mode.matches("octal")){
            Integer octalNum = (Integer) num;
            result += operations.toOctal(num);
        } else if(mode.matches("decimal")){
            Integer decimalNum = (Integer) num;
            // result += operations.toDecimal(Num);
            // result += operations.toDecimal(y);
        } else if (mode.matches("hexadecimal")){
            Integer hexadecimalNum = (Integer) num;
            result += operations.toOctal(num);
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

        case "-": result+= operations.sub(x,y);
        break;
        
        case "/": result+= operations.div(x,y);
        break;

        case "*": result+= operations.multiply(x,y);
        break;

        case "^": result+= operations.exponentiationMethod(x,y);
        break;
        
        case "inverse": result+= operations.inverseMethod(x);
        break;

        case "square": result+= operations.squareMethod(x);
        break;
        
        case "invert": result+= operations.invertMethod(x);
        break;

        case "!": result+= operations.factorialMethod(x);
        break;

        case "sqrt": result+= operations.squareRootMethod(x);
        break;
        
        case "sin": result+= operations.sineMathMethod(x);
        break;

        case "asin": result+= operations.invSineMathMethod(x);
        break;

        case "cos": result+= operations.cosMathMethod(x);
        break;

        case "acos": result+= operations.invCosMathMethod(x);
        break;

        case "tan": result+= operations.tanMathMethod(x);
        break;

        case "atan": result+= operations.invTanMathMethod(x);
        break;
        }
        return result;
    }
}
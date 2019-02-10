public class Logic {
	
	private static Operations operator = new Operations();
	
	public static void arithmetic(String operator, int x, int y) {
		
		if(operator.equals((binary)||(octal)||(decimal)||(hexadecimal)){
			switchDisplayMode(operation);
		} else if(operation.equals(display)) {
			switchDisplayMode();
		}

		switch(operator.toLowerCase()) {

		case "+": operations.add(x,y);
		break;

		case "-": operations.subtract(x,y);
		break;
		
		case "/": operations.divide(x,y);
		break;

		case "%": operations.remainder(x,y);
		break;

		case "*": operations.mulit(x,y);
		break;

		case "^": operations.exponentiation(x,y);
		break;
		
		case "inverse": operations.inverse(x);
		break;

		case "square": operations.square(x);
		break;
		
		case "invert": operations.invert(x,y);
		break;

		case "factorial": operations.factorial(x);
		break;
		
		case "switchSign": operations.switchSign(x);
		break;

		case "sqrt": operations.sqrt(x);
		break;
		
		case "sine": operations.sine(x,y);
		break;

		case "asin": operations.asin(x,y);
		break;

		case "cos": operations.cos(x,y);
		break;

		case "acos": operations.acos(x,y);
		break;

		case "tan": operations.tan(x,y);
		break;

		case "atan": operations.atan(x,y);
		break;

		case "quit":
		break;
		}
	}
}
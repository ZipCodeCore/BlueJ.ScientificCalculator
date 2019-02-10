
/**
 * Input reads user input and uses regular expressions to parse the inputted string.
 *
 * Mark Moll Feb 9 2019 
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Input {
    private static Calculations calc = new Calculations();
    public static void main(String[] args) {
        String input = "80 * 80";
        String pattern = ("(\\d+)\\s?([+>\\-<=≠≥≤÷−*x·%/])\\s*(\\d+)");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        m.matches();
        boolean found = p.matcher(input).lookingAt();
        System.out.println("'" + pattern + "'" +
                (found ? " matches '" : " doesn't match '") + input + "'");
        String stringNum1 = m.group(1);
        String stringNum2 = m.group(3);
        String stringOp = m.group(2);
        double unsignedFirstNum = Double.parseDouble(stringNum1);
        double unsignedSecondNum = Double.parseDouble(stringNum2);
        double result = 0.0;
        switch(stringOp) {
            case"+": result = calc.add(unsignedFirstNum,unsignedSecondNum);
                break;
            case"-":result = calc.subtract(unsignedFirstNum,unsignedSecondNum);
                break;
            case"−":result = calc.subtract(unsignedFirstNum,unsignedSecondNum);
                break;
            case"*":result = calc.multiply(unsignedFirstNum,unsignedSecondNum);
                break;
            case"/":result = calc.divide(unsignedFirstNum,unsignedSecondNum);
                break;
            case"÷":result = calc.divide(unsignedFirstNum,unsignedSecondNum);
                break;
            case"x":result = calc.multiply(unsignedFirstNum,unsignedSecondNum);
                break;
            case"·":result = calc.multiply(unsignedFirstNum,unsignedSecondNum);
                break;
        }
        System.out.print(result);
    }
}
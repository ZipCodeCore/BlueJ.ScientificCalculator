/**
 * Takes in a string via user input and parses the two ints or doubles the mathematical operator using regex.
 *
 * Mark Moll Feb 10 2019
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Input {
    private static Calculations calc = new Calculations();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = ("(-)?((\\d+)(\\.\\d+)?)\\s*([+\\-÷−*x·/])\\s*(-)?((\\d+)(\\.\\d+)?)");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        m.matches();
        String stringNum1 = m.group(2);
        String stringNum2 = m.group(7);
        String stringOp = m.group(5);
        String stringFirstSign = m.group(1);
        String stringSecondSign = m.group(6);
        double unsignedFirstNum = Double.parseDouble(stringNum1);
        double unsignedSecondNum = Double.parseDouble(stringNum2);
        double result = 0.0;
        if (stringOp.equals("/") && unsignedSecondNum == 0){System.out.print("Error! Please don't divide by zero.");
        } else {
            switch(stringOp) {
                case"+": result = calc.add(unsignedFirstNum,unsignedSecondNum);
                break;
                case"-": case"−": result = calc.subtract(unsignedFirstNum,unsignedSecondNum);
                break;
                case"*": case"x": case"·": result = calc.multiply(unsignedFirstNum,unsignedSecondNum);
                break;
                case"/": result = calc.divide(unsignedFirstNum,unsignedSecondNum);
                break;
                case"^": result = calc.pow(unsignedFirstNum,unsignedSecondNum);
                break;}
            if ((m.find(1) ^ m.find(6)) && unsignedSecondNum != 0){result = -1 * result;
            }
            double memoryResult = result;
            System.out.print(result);
            result = 0.0;
        }
    }
}
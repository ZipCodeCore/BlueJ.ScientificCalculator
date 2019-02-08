import java.lang.Math;
import java.util.*;
/**
 * Created by leon on 2/9/18.
 */
public class Console {    
    public static void main(String[] args){
        boolean run = true;                
        double x = 0;
        double y = 0;
        double answer = 0.0;        
        Scanner scanObject = new Scanner(System.in);
   
        while (run) {
                System.out.println("Enter A number: ");
                x = scanObject.nextDouble();
                System.out.println("Enter An operation? Choose one below.");
                System.out.println("( sin ) ( cos ) ( tan ) ( asin ) ( acos ) ( atan ) ( sqrt ) ");
                System.out.println("( + ) ( - ) ( * ) ( / ) ( ^ )");
                String operator = scanObject.next();//.charAt(0);
                String s = "";  
                if (operator.equals("sin") || operator.equals("asin") || operator.equals("cos") || operator.equals("acos") || operator.equals("tan") || operator.equals("atan") || operator.equals("sqrt")) {
                        switch (operator){
                            case "sin": answer = Math.toDegrees(Math.sin(x));
                                break;
                            case "asin": answer = Math.toDegrees(Math.asin(x));
                                break;                    
                            case "cos": answer = Math.toDegrees(Math.cos(x));
                                break;
                            case "acos": answer = Math.toDegrees(Math.acos(x));
                                break;                    
                            case "tan": answer = Math.toDegrees(Math.tan(x));
                                break;
                            case "atan": answer = Math.toDegrees(Math.atan(x));
                                break;
                            case "sqrt": answer = Math.toDegrees(Math.sqrt(x));
                                break;                                
                       //case "!": answer = factorial(x);
                           //break;                                
                        }            
                            System.out.println(Math.toRadians(answer));
                            continue;
               } else                         
                
                   
                System.out.println("Enter A second number: ");
                y = scanObject.nextDouble();
                s = scanObject.nextLine();
            
                switch (operator) {
                       case "+": answer = x + y;
                           break;
                       case "-": answer = x - y;
                           break;
                       case "*": answer = x * y;
                           break;
                       case "/": answer = x/y;
                           break;
                       case "^": answer = Math.pow (x,y);
                           break;
                           
                }        
                   System.out.println(x + " " + operator + " " + y + " = " + answer);
                   System.out.println("Continue or Quit");
                   s = scanObject.nextLine();
                   if (s.equalsIgnoreCase("Quit")){
                       System.out.println("Have A good day!! :) ");
                       break;
                    }
        }
    }
}

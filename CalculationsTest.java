

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculationsTest{
    private static volatile Calculations calculations = new Calculations();
    @Test  
    public void testMultiply(){
        
        double firstNum = 2;
        double secondNum = 5;
        
        double expected = 10;
        double actual = Calculations.multiply(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testMultiply2(){
        double firstNum = 2.72;
        double secondNum = 3.65;
        
        double expected = 9.928;
        double actual = Calculations.multiply(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testMultiply3(){
        double firstNum = -3;
        double secondNum = 6;
        
        double expected = -18;
        double actual = Calculations.multiply(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testDivide(){
        double firstNum = 10;
        double secondNum = 5;
        
        double expected = 2;
        double actual = Calculations.divide(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testDivide2(){
        double firstNum = 10;
        double secondNum = 4;
        
        double expected = 2.5;
        double actual = Calculations.divide(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testDivide3(){
        double firstNum = -10;
        double secondNum = -2;
        
        double expected = 5;
        double actual = Calculations.divide(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testAdd(){
        
        double firstNum = 2;
        double secondNum = 5;
        
        double expected = 7;
        double actual = Calculations.add(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
        }
    @Test
    public void testAdd2(){
        double firstNum = 1027;
        double secondNum = 3245;
        
        double expected = 4272;
        double actual = Calculations.add(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testAdd3(){
        double firstNum = 3.476;
        double secondNum = 6.231;
        
        double expected = 9.707;
        double actual = Calculations.add(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSubtract(){
     
        double firstNum = 2;
        double secondNum = 5;
        
        double expected = -3;
        double actual = Calculations.subtract(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSubtract2(){
        double firstNum = -8374;
        double secondNum = -342;
        
        double expected = -8032;
        double actual = Calculations.subtract(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSubtract3(){
        double firstNum = 2.75;
        double secondNum = 8.23;
        
        double expected = -5.48;
        double actual = Calculations.subtract(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSquare(){
       double firstNum = 2;
       
       double expected = 4;
       double actual = Calculations.square(firstNum);
       
       Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSquare2(){
        double firstNum = -10;
        
        double expected = 100;
        double actual = Calculations.square(firstNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSquare3(){
        double firstNum = 5.5;
        
        double expected = 30.25;
        double actual = Calculations.square(firstNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSqrt(){
        double firstNum = 9;
        
        double expected = 3;
        double actual = Calculations.sqrt(firstNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testPow(){
        double firstNum = 2;
        double secondNum = 3;
        
        double expected = 8;
        double actual = Calculations.pow(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testInverse(){
        double firstNum = 2;
        
        double expected = 0.5;
        double actual = Calculations.inverse(firstNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testchangeSign(){
        double firstNum = 5;
        
        double expected = -5;
        double actual = Calculations.changeSign(firstNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
}



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculatorTest
{
    private Calculator calculator;
    /**
     * Default constructor for test class CalculatorTest
     */
    public CalculatorTest()
    {
      
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
   @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void squareMethodTest(){
        //:Given
        int x = 5;
        
        //Expected
         double expected = 25;
         double actual =  calculator.squareMethod( x );

        //:Then
        Assert.assertEquals("Values should be equal", expected, actual);
    }
    
    @Test
    public void addMethodTest(){
        //:Given
        double x = 5;
        double y = 8;
        
        //Expected
         double expected = 13;
         double actual =  calculator.add(x , y);

        //:Then
        Assert.assertEquals("Values should be equal", expected, actual);
    }
    
    
    @Test
    public void subStartMethodTest(){
        //:Given
        double x = 8;
        double y = 5;
        
        //Expected
         double expected = 3;
         double actual =  calculator.sub(x , y);

        //:Then
        Assert.assertEquals("Values should be equal", expected, actual);
    }
    
    @Test
    public void multiStartMethodTest(){
        //:Given
        double x = 5;
        double y = 8;
        
        //Expected
         double expected = 40;
         double actual =  calculator.multiply(x , y);

        //:Then
        Assert.assertEquals("Values should be equal", expected, actual);
    }
    
    
    @Test
    public void divStartMethodTest(){
        //:Given
        double x = 8;
        double y = 5;
        
        //Expected
         double expected = 1.6;
         double actual =  calculator.div(x , y);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    
    
    @Test
    public void squareRootMethodTest(){
        //:Given
        int x = 16;
        
        
        //Expected
         double expected = 4.0;
         double actual =  calculator.squareRootMethod(x);
         
               

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    
    public void exponentiationMethodTest(){
        //:Given
        int x = 3;
        int y = 2;
        
        
        //Expected
         double expected = 9;
         double actual =  calculator.exponentiationtMethod( x , y );
         
               

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    public void invertMethodTest(){
        //:Given
        int x = 3;
        
        
        
        //Expected
         double expected = -3;
         double actual =  calculator.invertMethod( x );
         
               

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    @Test
    public void inverseMethodTest(){
        //:Given
        int x = 2;
        
        //Expected
         double expected = 0.5;
         double actual =  calculator.inverseMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    @Test
    public void sineMathMethodTest(){
        //:Given
        double x = 90.0;
        
        //Expected
         double expected = 1.0;
         double actual =  calculator.sineMathMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
     @Test
    public void tanMathMethodTest(){
        //:Given
        double x = 45.0;
        
        //Expected
         double expected = 0.9999999999999999;
         double actual =  calculator.tanMathMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    @Test
    public void invSineMathMethodTest(){
        //:Given
        double x = 45.0;
        
        //Expected
         double expected = 0.9033391107665127;
         double actual =  calculator.invSineMathMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    @Test
    public void invCosMathMethodTest(){
        //:Given
        double x = 45.0;
        
        //Expected
         double expected = 0.6674572160283838;
         double actual =  calculator.invCosMathMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    @Test
    public void invTanMathMethodTest(){
        //:Given
        double x = 45.0;
        
        //Expected
         double expected = 0.6657737500283538;
         double actual =  calculator.invTanMathMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    @Test
    public void factorialMethodTest(){
        //:Given
        int x = 4;
        
        //Expected
         float expected = 24;
         double actual =  calculator.factorialMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
}

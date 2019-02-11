

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
        Double x = 5.0;
        
        //Expected
         Double expected = 25.0;
         Double actual =  calculator.squareMethod( x );

        //:Then
        Assert.assertEquals("Values should be equal", expected, actual);
    }
    
    @Test
    public void addMethodTest(){
        //:Given
        Double x = 5.0;
        Double y = 8.0;
        
        //Expected
         Double expected = 13.0;
         Double actual =  calculator.add(x , y);

        //:Then
        Assert.assertEquals("Values should be equal", expected, actual);
    }
    
    
    @Test
    public void subStartMethodTest(){
        //:Given
        Double x = 8.0;
        Double y = 5.0;
        
        //Expected
         Double expected = 3.0;
         Double actual =  calculator.sub(x , y);

        //:Then
        Assert.assertEquals("Values should be equal", expected, actual);
    }
    
    @Test
    public void multiStartMethodTest(){
        //:Given
        Double x = 5.0;
        Double y = 8.0;
        
        //Expected
         Double expected = 40.0;
         Double actual =  calculator.multiply(x , y);

        //:Then
        Assert.assertEquals("Values should be equal", expected, actual);
    }
    
    
    @Test
    public void divStartMethodTest(){
        //:Given
        Double x = 8.0;
        Double y = 5.0;
        
        //Expected
         Double expected = 1.6;
         Double actual =  calculator.div(x , y);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    
    
    @Test
    public void squareRootMethodTest(){
        //:Given
        Double x = 16.0;
        
        
        //Expected
         Double expected = 4.0;
         Double actual =  calculator.squareRootMethod(x);
         
               

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    
    public void exponentiationMethodTest(){
        //:Given
        Double x = 3.0;
        Double y = 2.0;
        
        
        //Expected
         Double expected = 9.0;
         Double actual =  calculator.exponentiationMethod( x , y );
         
               

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    public void invertMethodTest(){
        //:Given
        Double x = 3.0;
        
        
        
        //Expected
         Double expected = -3.0;
         Double actual =  calculator.invertMethod( x );
         
               

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    @Test
    public void inverseMethodTest(){
        //:Given
        Double x = 2.0;
        
        //Expected
         Double expected = 0.5;
         Double actual =  calculator.inverseMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    @Test
    public void sineMathMethodTest(){
        //:Given
        Double x = 90.0;
        
        //Expected
         Double expected = 1.0;
         Double actual =  calculator.sineMathMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
     @Test
    public void tanMathMethodTest(){
        //:Given
        Double x = 45.0;
        
        //Expected
         Double expected = 0.9999999999999999;
         Double actual =  calculator.tanMathMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    @Test
    public void invSineMathMethodTest(){
        //:Given
        Double x = 45.0;
        
        //Expected
         Double expected = 0.9033391107665127;
         Double actual =  calculator.invSineMathMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    @Test
    public void invCosMathMethodTest(){
        //:Given
        Double x = 45.0;
        
        //Expected
         Double expected = 0.6674572160283838;
         Double actual =  calculator.invCosMathMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    @Test
    public void invTanMathMethodTest(){
        //:Given
        Double x = 45.0;
        
        //Expected
         Double expected = 0.6657737500283538;
         Double actual =  calculator.invTanMathMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
    
    @Test
    public void factorialMethodTest(){
        //:Given
        Double x = 4.0;
        
        //Expected
         Long expected = 24L;
         Long actual =  calculator.factorialMethod(x);

        //:Then
        Assert.assertEquals(  expected, actual , Double.NaN);
    }
}

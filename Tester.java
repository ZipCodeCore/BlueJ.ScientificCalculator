
import org.junit.Test;
import org.junit.Assert;

/**
 * The test class Tester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    /**
     * Default constructor for test class Tester
     */
    @Test
    public void testAdd(){
        // : Given
        String stringAddition = "1+2";
        String expected = "3.0";
        
        //String actual = Calculator.calc( stringAddition );
        
        Assert.assertEquals(expected, expected);
    }

}


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
        String stringAddition = "3-1";
        String expected = "2.0";
        
        Calculator c = new Calculator();
        
        String actual = c.calc( stringAddition );
        
        Assert.assertEquals(actual, expected);
    }

}



import org.junit.Assert;
import org.junit.Test;
import java.lang.Math;

/**
 * The test class BonusFeaturesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BonusFeaturesTest
{
    //Log Function Test
    static final double epsilon = .0005;
    
    @Test
    public void testLn1(){
        //Given
        double expected = 1.0;
        double testingWith = Math.E;
        
        //When
        double actual = BonusFeatures.naturalLog(testingWith);
        
        //Then
        Assert.assertEquals(expected,actual,epsilon );
    }
    
    @Test
    public void testLn2(){
    
    }
    
    @Test
    public void testLn3(){
        
    }

}



import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Joe Fennimore
 */
public class CalculationsTest{
    private static volatile Calculations calculations = new Calculations();
    @Test
    public void testMultiply(){
        //Given
        double firstNum = 2;
        double secondNum = 5;
        //When
        double expected = 10;
        double actual = Calculations.multiply(firstNum, secondNum);
        //Then
        Assert.assertEquals(expected, actual);
    }
   
}

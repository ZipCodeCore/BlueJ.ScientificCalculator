

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
        //When
        double actual = BonusFeatures.naturalLog(Math.E);
        //Then
        Assert.assertEquals(expected,actual,epsilon );
    }

    @Test
    public void testLn2(){
        //Given
        double expected = .69314718055;
        //When
        double actual = BonusFeatures.naturalLog(2);
        //Then
        Assert.assertEquals(expected,actual,epsilon);

    }

    @Test
    public void testLn3(){
        //Given
        double expected = -.223144;
        //When
        double actual = BonusFeatures.naturalLog(.8);
        //Then
        Assert.assertEquals(expected,actual,epsilon);

    }

    @Test
    public void testInverseLn1(){
        //Given
        double expected = 20.08553692318;
        //When
        double actual = BonusFeatures.inverseNaturalLog(3);
        //Then
        Assert.assertEquals(expected,actual,epsilon);

    }

    @Test
    public void testInverseLn2(){
        //Given
        double expected = .049787068;
        //When
        double actual = BonusFeatures.inverseNaturalLog(-3);       //Then
        Assert.assertEquals(expected,actual,epsilon);

    }

    @Test
    public void testLog101(){
        //Given
        double expected = .4771212547;
        //When
        double actual = BonusFeatures.log(3);
        //Then
        Assert.assertEquals(expected,actual,epsilon);

    }

    @Test
    public void testLog102(){   
        //Given
        double expected = -.221849;
        //When
        double actual = BonusFeatures.log(.6);
        //Then
        Assert.assertEquals(expected,actual,epsilon);

    }

    @Test
    public void testInverseLog1(){   
        //Given
        double expected = 100;
        //When
        double actual = BonusFeatures.inverseLog(2);
        //Then
        Assert.assertEquals(expected,actual,epsilon);

    }

    @Test
    public void factorial1(){   
        //Given
        double expected = 6;
        //When
        double actual = BonusFeatures.factorial(3);
        //Then
        Assert.assertEquals(expected,actual,epsilon);

    }
    
    @Test
    public void factorial2(){
        //Given
        double expected = 3628800;
        //When
        double actual = BonusFeatures.factorial(10);
        //Then
        Assert.assertEquals(expected,actual,epsilon);
    }
}


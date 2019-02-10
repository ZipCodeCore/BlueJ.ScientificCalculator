

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProcessorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProcessorTest
{
    private static Processor processor;
    /**
     * Default constructor for test class ProcessorTest
     */
    public ProcessorTest()
    {
        processor = new Processor();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public static void testArithmetic() {
        processor.arithmetic("+", 2.0, 3.0);
        assertEquals("+", 2.0, 3.0);
    }

    @Test
    public static void testDisplay() {
        processor.arithmetic("");
        assertEquals("+", 2.0, 3.0);
    }
}

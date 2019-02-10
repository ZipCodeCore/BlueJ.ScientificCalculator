import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author leon on 03/02/2019.
 */
public class PrintTest {
    private IOConsole console;
    @Test
    public void test1() {
        String outputString = "The quick brown fox";
        test(outputString);
    }

    @Test
    public void test2() {
        String outputString = "The quick %s fox";
        String[] stringArguments = {"brown"};
        test(outputString, stringArguments);
    }

    @Test
    public void test3() {
        String outputString = "The %s %s fox";
        String[] stringArguments = {"quick", "brown"};
        test(outputString, stringArguments);
    }

    @Test
    public void test5() {
        String outputString = "Over the lazy dog";
        test(outputString);
    }

    @Test
    public void test6() {
        String outputString = "Over the %s dog.";
        String[] stringArguments = {"lazy"};
        test(outputString, stringArguments);
    }

    @Test
    public void test7() {
        String outputString = "Over the %s %s.";
        String[] stringArguments = {"lazy", "dog"};
        test(outputString, stringArguments);
    }

    @Test
    public void test8() {
        String outputString = "The quick brown fox";
        test(outputString);
    }

    @Test
    public void test9() {
        String outputString = "The quick %s fox";
        String[] stringArguments = {"brown"};
        test(outputString, stringArguments);
    }

    @Test
    public void test10() {
        String outputString = "The %s %s fox";
        String[] stringArguments = {"quick", "brown"};
        test(outputString, stringArguments);
    }

    @Test
    public void test11() {
        String outputString = "Over the lazy dog";
        test(outputString);
    }

    @Test
    public void test12() {
        String outputString = "Over the %s dog.";
        String[] stringArguments = {"lazy"};
        test(outputString, stringArguments);
    }

    @Test
    public void test13() {
        String outputString = "Over the %s %s.";
        String[] stringArguments = {"lazy", "dog"};
        test(outputString, stringArguments);
    }

    private void test(String outputString, String... stringArguments) {
        // Given
        String expected = String.format(outputString, stringArguments) + "\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        IOConsole console = new IOConsole(System.in, new PrintStream(outputStream));

        // When
        console.println(outputString, stringArguments);
        String actual = outputStream.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test14() {
        test("0");
    }

    @Test
    public void test15() {
        test("1");
    }

    @Test
    public void test16() {
        test("3.4028235E38");
    }

    @Test
    public void test17() {
        test("-9223372036854775808");
    }

    @Test
    public void test18() {
        test("1.1");
    }

    @Test
    public void test19() {
        test("_");
    }


    private void test(String input) {
        // Given
        String expected = input;
        this.console = getConsoleWithBufferedInput(input);

        // When
        String actual = console.getStringInput("");

        // Then
        Assert.assertEquals(actual, expected);
    }

     @Test
    public void test20() {
        IOConsole console = new IOConsole();
        
        test("0.0", 0.0);
    }

    @Test
    public void test21() {
        test("1.1", 1.1);
    }

    @Test
    public void test22() {
        test("3.4028235E38", Double.MAX_VALUE);
    }

    @Test
    public void test23() {
        test("1.4E-45", Double.MIN_VALUE);
    }

    @Test
    public void test24() {
        test("1.0", 1.0);
    }

    private void test(String input, Double expectedInput) {
        // Given
        this.console = getConsoleWithBufferedInput(input);

        // When
        Double actual = console.getDoubleInput("");

        // Then
        Assert.assertEquals(actual, expectedInput);
    }

    private IOConsole getConsoleWithBufferedInput(String inputString) {
        byte[] inputBytes = inputString.getBytes();
        ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
        Scanner scanner = new Scanner(inputByteArray);
        IOConsole console = new IOConsole(scanner, System.out);
        return console;
    }
}

   


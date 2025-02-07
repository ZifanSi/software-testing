package calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testDividePositiveNumbers() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testDivideNegativeNumbers() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, -2);
        assertEquals(-5.0, result, 0.0001);
    }

    // New Test: Division by Zero (Should Throw Exception)
    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10, 0);
            fail("Expected ArithmeticException was not thrown");
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero.", e.getMessage());
        }
    }

    // New Test: Zero Divided by a Number
    @Test
    public void testZeroDividedByNumber() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(0, 5);
        assertEquals(0.0, result, 0.0001);
    }

    //New Test: Floating-Point Precision
    @Test
    public void testFloatingPointPrecision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(1, 3);
        assertEquals(0.3333, result, 0.0001);
    }

    // New Test: Large Numbers
    @Test
    public void testLargeNumbers() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(1e10, 2);
        assertEquals(5e9, result, 0.0001);
    }

    // New Test: Small Numbers
    @Test
    public void testSmallNumbers() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(0.0001, 0.0002);
        assertEquals(0.5, result, 0.0001);
    }

    // New Test: Negative Zero Result
    @Test
    public void testNegativeZeroResult() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(-0.0, 5);
        assertEquals(-0.0, result, 0.0001);
    }

    // New Test: Positive Infinity Result
    @Test
    public void testInfinityResult() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0001);
    }

    // New Test: Negative Infinity Result
    @Test
    public void testNegativeInfinityResult() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(-10, 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, result, 0.0001);
    }

    // New Test: Division by Infinity
    @Test
    public void testDivideByInfinity() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(5, Double.POSITIVE_INFINITY);
        assertEquals(0.0, result, 0.0001);
    }

    // New Test: Infinity Divided by a Number
    @Test
    public void testInfinityDividedByNumber() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(Double.POSITIVE_INFINITY, 5);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0001);
    }

    // New Test: NaN Case (0.0 / 0.0)
    @Test
    public void testDivideZeroByZero() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(0.0, 0.0);
        assertEquals(Double.NaN, result, 0.0001);
    }
}

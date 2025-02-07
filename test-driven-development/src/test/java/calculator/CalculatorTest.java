package calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {

    @Test
    public void testDivide() {
        CalculatorTDD calculator = new CalculatorTDD();
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testDivideByZero() {
        CalculatorTDD calculator = new CalculatorTDD();
        try {
            calculator.divide(10, 0);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }

    @Test
    public void testDivideNegativeNumbers() {
        CalculatorTDD calculator = new CalculatorTDD();
        double result = calculator.divide(10, -2);
        assertEquals(-5.0, result, 0.0001);
    }
}

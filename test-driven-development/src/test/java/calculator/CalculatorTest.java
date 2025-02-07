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

    // 4. Zero Divided by a Number
    @Test
    public void testZeroDividedByNumber() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(0, 5);
        assertEquals(0.0, result, 0.0001);
    }   

    // 5. Floating-Point Precision
    @Test
    public void testFloatingPointPrecision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(1, 3);
        assertEquals(0.3333, result, 0.0001);
    }



}

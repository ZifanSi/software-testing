package calculator;

/**
 * Calculator class implementing a robust divide method.
 */
public class Calculator {

    /**
     * Safely divides two numbers.
     * @param a the numerator
     * @param b the denominator
     * @return the result of division
     * @throws ArithmeticException if an attempt is made to divide by zero
     */
    public double divide(double a, double b) {
        // Special case: 0.0 / 0.0 should return NaN
        if (a == 0.0 && b == 0.0) {
            return Double.NaN;
        }

        // Manually throw an exception for division by zero
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        // Perform normal division
        return a / b;
    }
}

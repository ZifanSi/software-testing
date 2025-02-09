package calculator;

/**
 * Calculator class
 */
public class Calculator {

    /**
     * Safely divides two numbers.
     * @param a the numerator
     * @param b the denominator
     * @return the result of division
     * @throws ArithmeticException if an attempt is made to divide by zero (for integers)
     */
    public double divide(double a, double b) {
        // Special case: 0.0 / 0.0 should return NaN
        if (Double.isNaN(a / b)) {
            return Double.NaN;
        }

        // Throw an exception only when dividing by integer zero
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        // Perform division and return the result
        return a / b;
    }
}
package calculator;

/**
 * Simple Calculator class.
 */
public class CalculatorTDD {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

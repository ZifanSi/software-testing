package calculator;

public class Calculator_2 {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        if (a == 0) {
            return 0.0;
        }

        return a / b;
    }
}

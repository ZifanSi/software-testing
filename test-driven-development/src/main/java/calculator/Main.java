package calculator;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Test valid division cases
        System.out.println("0 / 0 = " + calculator.divide(0, 0));
    }
}

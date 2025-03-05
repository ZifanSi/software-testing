package roman;

public class RomanNumerals {
    public static String roman(int number) {
        int x = (number % 100) / 10;
        int i = (number % 10) / 1;
        return romanForDigit(i, 'I', 'V', 'X');
    }

    private static String romanForDigit(int digit, char one, char five, char ten) {
        if (digit == 0) return "";
        if (digit <= 3) return repeatedChar(digit, one);
        if (digit == 4) return "" + one + five;
        if (digit <= 8) return five + repeatedChar(digit - 5, one);
        return "" + one + five + ten;
    }

    private static String repeatedChar(int count, char c) {
        String result = "";
        for (int i = 0; i < count; i++) result += c;
        return result;
    }

    // Main method to test the program
    public static void main(String[] args) {
        int number = 9; // Example input
        System.out.println("Roman numeral of " + number + " is: " + roman(number));
    }
}

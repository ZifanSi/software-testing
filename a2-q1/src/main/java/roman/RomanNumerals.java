package roman;

public class RomanNumerals {
    public static String roman(int number) {
        if (number < 1 || number > 99) {  
            throw new IllegalArgumentException("Number out of supported range (1-99)");
        }

        int x = (number % 100) / 10;  // tens place
        int i = (number % 10);        // ones place

        return romanForDigit(x, 'X', 'L', 'C') +  // Tens place
               romanForDigit(i, 'I', 'V', 'X');   // Ones place
    }

    private static String romanForDigit(int digit, char one, char five, char ten) {
        if (digit == 0) return "";
        if (digit <= 3) return repeatedChar(digit, one);
        if (digit == 4) return "" + one + five;
        if (digit <= 8) return five + repeatedChar(digit - 5, one);
        return "" + one + ten;
    }

    private static String repeatedChar(int count, char c) {
        String result = "";
        for (int i = 0; i < count; i++) result += c;
        return result;
    }
}

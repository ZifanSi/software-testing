package roman;

public class RomanNumerals {
    public static String roman(int number) {
        if (number < 1 || number > 999) {  
            throw new IllegalArgumentException("Number out of supported range (1-999)");
        }

        int c = (number % 1000) / 100; 
        int x = (number % 100) / 10;  
        int i = (number % 10) / 1; 

        return romanForDigit(c, 'C', 'D', 'M') + 
               romanForDigit(x, 'X', 'L', 'C') + 
               romanForDigit(i, 'I', 'V', 'X');
    }

    private static String romanForDigit(int digit, char one, char five, char ten) {
        if (digit == 0) return "";
        if (digit <= 3) return repeatedChar(digit, one);
        if (digit == 4) return "" + one + five;
        if (digit <= 8) return five + repeatedChar(digit - 5, one);
        return "" + one + ten;
    }

    private static String repeatedChar(int count, char c) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) result.append(c);
        return result.toString();
    }
}

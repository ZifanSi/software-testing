package utils;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example 1: Finding the minimum integer in a list
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        System.out.println("List: " + numbers);
        System.out.println("Minimum value: " + Min.min(numbers));

        // Example 2: Finding the minimum string (alphabetically first)
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println("\nList: " + words);
        System.out.println("Minimum value: " + Min.min(words));

        // Example 3: Finding the minimum in a list with duplicates
        List<Integer> duplicates = Arrays.asList(4, 4, 4, 2, 4);
        System.out.println("\nList: " + duplicates);
        System.out.println("Minimum value: " + Min.min(duplicates));

        // Example 4: Finding the minimum in a single-element list
        List<Integer> singleElement = Arrays.asList(42);
        System.out.println("\nList: " + singleElement);
        System.out.println("Minimum value: " + Min.min(singleElement));

        // Example 5: Finding the minimum in a list with all identical elements
        List<Integer> allSame = Arrays.asList(7, 7, 7, 7);
        System.out.println("\nList: " + allSame);
        System.out.println("Minimum value: " + Min.min(allSame));

        // Example 6: Finding the minimum in a list of negative numbers
        List<Integer> negatives = Arrays.asList(-10, -20, -5, -30);
        System.out.println("\nList: " + negatives);
        System.out.println("Minimum value: " + Min.min(negatives));

        // Example 7: Finding the minimum in a mixed list of positive and negative numbers
        List<Integer> mixedNumbers = Arrays.asList(15, -5, 0, 25, -10);
        System.out.println("\nList: " + mixedNumbers);
        System.out.println("Minimum value: " + Min.min(mixedNumbers));

        // Example 8: Finding the minimum in a list of decimal values
        List<Double> decimals = Arrays.asList(5.5, 2.2, 8.8, 1.1, 3.3);
        System.out.println("\nList: " + decimals);
        System.out.println("Minimum value: " + Min.min(decimals));
    }
}


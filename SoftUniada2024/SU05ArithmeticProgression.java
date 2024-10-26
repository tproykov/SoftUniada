package SoftUniada2024;

import java.util.Arrays;
import java.util.Scanner;

public class SU05ArithmeticProgression {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // read the input from the console
        int[] integerArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        // length of the array
        int n = integerArray.length;

        // apply the method of finding the count of arithmetic progressions
        int count = countArithmeticProgressions(integerArray, n);
        System.out.println(count);
    }

    // count the number of arithmetic progressions
    public static int countArithmeticProgressions(int[] integerArray, int n) {

        // iterate through all possible sub-arrays (combination of elements)
        int totalCountProgressions = 0;
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = 0; j < integerArray.length; j++) {
                if (isArithmeticProgression(integerArray, i, j)) {
                    totalCountProgressions++;
                }
            }
        }
        return totalCountProgressions;
    }

    // check if a subsequence is an arithmetic progression
    public static boolean isArithmeticProgression(int[] array, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) return true;  // Single element, empty and pair are AP

        int diff = array[startIndex + 1] - array[startIndex];
        for (int i = startIndex + 1; i <= endIndex - 1; i++) {
            if (array[i + 1] - array[i] != diff) {
                return false;  // If the difference between consecutive elements is not constant
            }
        }
        return true;
    }
}
package SoftUniada2024;

import java.util.Arrays;
import java.util.Scanner;

public class SU05ArithmeticProgression {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] integerArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        int count = countArithmeticProgressions(integerArray); 
        System.out.println(count);
    }

    // count the number of arithmetic progressions
    public static int countArithmeticProgressions(int[] integerArray) {

        // iterate through all possible sub-arrays (combination of elements)
        int totalCountProgressions = 0;
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = i + 1; j <= integerArray.length; j++) {
                if (isArithmeticProgression(integerArray, i, j)) {
                    totalCountProgressions++;
                }
            }
        }
        return totalCountProgressions;
    }

    // check if a subsequence is an arithmetic progression
    public static boolean isArithmeticProgression(int[] array, int start, int end) {
        if (end - start <= 2) return true;  // Single element or empty is trivially AP

        int diff = array[start + 1] - array[start];
        for (int i = start + 1; i < end - 1; i++) {
            if (array[i + 1] - array[i] != diff) {
                return false;  // If the difference between consecutive elements is not constant
            }
        }
        return true;
    }
}
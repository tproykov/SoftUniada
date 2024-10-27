package SoftUniada2024;

import java.util.Arrays;
import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input array
        int[] integerArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Calculate total subsequences that are arithmetic progressions
        int count = countArithmeticProgressions(integerArray);
        System.out.println(count);
    }

    // Count the number of arithmetic progressions
    public static int countArithmeticProgressions(int[] array) {
        int n = array.length;

        // Starting with 1 for the empty subsequence and n for each single element
        int totalCountProgressions = 1 + n;

        // Loop through each possible subarray (of length >= 2)
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end < n; end++) {
                if (isArithmeticProgression(array, start, end)) {
                    totalCountProgressions++;
                }
            }
        }
        return totalCountProgressions;
    }

    // Check if a given subarray forms an arithmetic progression
    public static boolean isArithmeticProgression(int[] array, int start, int end) {
        if (end - start < 1) return true;  // Single element or empty sequence

        int diff = array[start + 1] - array[start];
        for (int i = start + 1; i < end; i++) {
            if (array[i + 1] - array[i] != diff) {
                return false;  // Difference doesn't match
            }
        }
        return true;
    }
}

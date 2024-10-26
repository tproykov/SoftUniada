package SoftUniada2024;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array of integers
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Call the function to count arithmetic progressions
        int count = countArithmeticSubarrays(arr);
        System.out.println(count);
    }

    // Method to count the number of arithmetic subsequences in the array
    private static int countArithmeticSubarrays(int[] arr) {
        if (arr.length <= 1) {
            return arr.length;
        }

        int count = arr.length; // Single elements are also arithmetic
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i]; // Common difference of potential AP

            for (int j = i + 2; j < arr.length; j++) {
                if (arr[j] - arr[j - 1] == diff) {
                    count++; // Valid AP found
                } else {
                    break; // Not an AP anymore
                }
            }
        }
        return count;
    }
}

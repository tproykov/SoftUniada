package SoftUniada2024;

import java.util.ArrayList;
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
        int count = 1; // Empty subsequence

        // Generate all possible subsequences using bit manipulation
        for (int mask = 1; mask < (1 << n); mask++) {
            ArrayList<Integer> subsequence = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subsequence.add(array[i]);
                }
            }

            if (isArithmeticProgression(subsequence)) {
                count++;
            }
        }

        return count;
    }

    // Check if a list forms an arithmetic progression
    private static boolean isArithmeticProgression(ArrayList<Integer> list) {
        if (list.size() <= 1) return true;
        if (list.size() == 2) return true;

        for (int i = 1; i < list.size() - 1; i++) {
            if ((list.get(i) - list.get(i-1)) != (list.get(i+1) - list.get(i))) {
                return false;
            }
        }
        return true;
    }
}
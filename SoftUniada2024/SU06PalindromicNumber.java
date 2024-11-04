package SoftUniada2024;

import java.util.Scanner;

public class SU06PalindromicNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        // Step 1: Count digits
        int[] digitCount = new int[10];
        for (char ch : input.toCharArray()) {
            digitCount[ch - '0']++;
        }

        // Step 2: Determine if a palindrome can be formed and find the middle digit (if any)
        StringBuilder halfPalindrome = new StringBuilder();
        int middleDigit = -1;

        for (int i = 9; i >= 0; i--) {
            if ((digitCount[i] & 1) == 1) { // Check for odd count using bitwise AND
                if (middleDigit != -1) {
                    System.out.println("No palindromic number available.");
                    return;
                }
                middleDigit = i;
            }
            // Add half of the even counts to halfPalindrome
            for (int j = 0; j < (digitCount[i] >> 1); j++) { // Divide count by 2 using bitwise right shift
                halfPalindrome.append(i);
            }
        }

        // Step 3: Form the largest palindromic number
        StringBuilder fullPalindrome = new StringBuilder(halfPalindrome);
        if (middleDigit != -1) {
            fullPalindrome.append(middleDigit);
        }
        fullPalindrome.append(halfPalindrome.reverse());

        System.out.println(fullPalindrome.toString());
    }
}
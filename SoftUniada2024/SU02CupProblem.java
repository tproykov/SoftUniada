package SoftUniada2024;

import java.util.Scanner;

public class SU02CupProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < (n / 2); row++) {

            for (int a = 1; a <= n + row; a++) {
                System.out.print(".");
            }
            for (int b = n * 3 - row * 2; b >= 0; b--) {
                System.out.print("#");
            }
            for (int c = 1; c <= n + row; c++) {
                System.out.print(".");
            }
            System.out.println();
        }

        for (int row = 0; row < (n / 2) + 1; row++) {

            for (int d = 1; d <= n + (n / 2) + row; d++) {
                System.out.print(".");
            }
            System.out.print("#");
            for (int e = 2 * n - 2 - row * 2; e >= 0; e--) {
                System.out.print(".");
            }
            System.out.print("#");
            for (int f = 1; f <= n + (n / 2) + row; f++) {
                System.out.print(".");
            }
            System.out.println();
        }


    }
}
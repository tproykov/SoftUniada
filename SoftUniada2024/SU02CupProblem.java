package SoftUniada2024;

import java.util.Scanner;

public class SU02CupProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // top half full and partial cup
        for (int row = 0; row < (n / 2); row++) {

            for (int a = 1; a <= n + row; a++) {
                System.out.print(".");
            }
            for (int b = n * 3 - row * 2; b > 0; b--) {
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
            for (int e = 2 * n - 2 - row * 2; e > 0; e--) {
                System.out.print(".");
            }
            System.out.print("#");
            for (int f = 1; f <= n + (n / 2) + row; f++) {
                System.out.print(".");
            }
            System.out.println();
        }

        for (int g = 1; g <= n * 2; g++) {
            System.out.print(".");
        }
        for (int h = 1; h <= n; h++) {
            System.out.print("#");
        }
        for (int i = 1; i <= n * 2; i++) {
            System.out.print(".");
        }
        System.out.println();

        for (int row = 1; row <= n / 2; row++) {

            for (int j = 1; j <= n * 2 - 2; j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= n + 4; k++) {
                System.out.print("#");
            }
            for (int l = 1; l <= n * 2 - 2; l++) {
                System.out.print(".");
            }
            System.out.println();
        }

        for (int m = 1; m <= 5 * n / 2 - 5; m++) {
            System.out.print(".");
        }
        System.out.print("D^A^N^C^E^");

        for (int o = 1; o <= 5 * n / 2 - 5; o++) {
            System.out.print(".");
        }
        System.out.println();

        for (int row = 1; row <= n / 2 + 1; row++) {

            for (int p = 1; p <= n * 2 - 2; p++) {
                System.out.print(".");
            }
            for (int q = 1; q <= n + 4; q++) {
                System.out.print("#");
            }
            for (int r = 1; r <= n * 2 - 2; r++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
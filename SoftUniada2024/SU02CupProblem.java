package SoftUniada2024;

import java.util.Scanner;

public class SU02CupProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= (n * 2) + 4; row++) {

            for (int i = 1; i <= n; i++) {
                System.out.print(".");
            }
            for (int j = n + 1; j <= n * 5 - n; j++) {
                System.out.print("#");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print(".");
            }
            System.out.println();

        }
    }
}
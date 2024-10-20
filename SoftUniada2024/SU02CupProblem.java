package SoftUniada2024;

import java.util.Scanner;

public class SU02CupProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < (n / 2); row++) {

            for (int i = 1; i <= n + row; i++) {
                System.out.print(".");
            }
            for (int j = n * 3; j >= 0; j--) {
                System.out.print("#");
            }
//            for (int k = 1; k <= n; k++) {
//                System.out.print(".");
//            }
            System.out.println();

        }
    }
}
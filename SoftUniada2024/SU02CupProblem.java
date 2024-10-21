package SoftUniada2024;

import java.util.Scanner;

public class SU02CupProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // top half full and partial cup
        for (int i = 1; i <= n + 1; i++) {

            int sideSizeDots = n + i;
            int midSizeHash = n * 3 - i * 2;

            StringBuilder row = new StringBuilder();

            row.append(".".repeat(sideSizeDots))
                    .append("#".repeat(midSizeHash))
                    .append(".".repeat(sideSizeDots));

            if (i > n / 2) {
                midSizeHash -= 2;

                row.append(".".repeat(sideSizeDots))
                        .append("#")
                        .append(".".repeat(midSizeHash))
                        .append("#")
                        .append(".".repeat(sideSizeDots));
            }
            System.out.println(row.toString());
        }



        


    }
}
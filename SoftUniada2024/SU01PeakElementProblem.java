package SoftUniada2024;

import java.util.Arrays;
import java.util.Scanner;

public class SU01PeakElementProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int peakElement = 0;

        if (array[0] > array[1]) {
            peakElement = array[0];
        }

        if (peakElement < array[array.length - 1] && array[array.length - 1] > array[array.length - 2]) {
            peakElement = array[array.length - 1];
        }

        for (int i = 1; i <= array.length - 2; i++) {

            if (peakElement < array[i] && array[i] > array[i + 1] && array[i] > array[i - 1]) {
                peakElement = array[i];
            }
        }
        System.out.println(peakElement);
    }
}
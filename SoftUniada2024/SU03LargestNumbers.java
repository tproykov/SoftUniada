package SoftUniada2024;

import java.util.*;
import java.util.stream.Collectors;

public class SU03LargestNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }

        List<Integer> sortedNumbers = list.stream().sorted().collect(Collectors.toList());

        Collections.reverse(sortedNumbers);

        for (int i = n - 1; i >= 0; i--) {

            System.out.println(sortedNumbers.get(i));
        }
    }
}
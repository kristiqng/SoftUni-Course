package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        boolean notEqual = false;
        int sum = 0;
        for (int i = 0; i < firstNumbers.length; i++) {
            if (firstNumbers[i] != secondNumbers[i]) {
                notEqual = true;
            }
            if (notEqual) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
            sum += firstNumbers[i];
        }
        if (!notEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}

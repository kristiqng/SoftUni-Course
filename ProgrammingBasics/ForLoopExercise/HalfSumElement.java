package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max) {
                max = number;
            }
        }
        int sumWithoutMax = sum - max;
        if (sumWithoutMax == max) {
            System.out.printf("Yes%nSum = %d", max);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(max-sumWithoutMax));
        }
    }
}

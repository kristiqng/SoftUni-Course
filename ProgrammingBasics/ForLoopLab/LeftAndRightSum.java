package ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1 ; i <= 2; i++) {
            for (int k = 1; k <= n; k++) {
                int number = Integer.parseInt(scanner.nextLine());
                if (i < 2) {
                    sum1 += number;
                } else {
                    sum2 += number;
                }
            }
        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum2);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}

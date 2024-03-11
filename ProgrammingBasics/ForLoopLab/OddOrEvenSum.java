package ForLoopLab;

import java.util.Scanner;

public class OddOrEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;
        for (int i = 1; i <= count; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }
        }
        if (even != odd) {
            System.out.printf("No%nDiff = %d", Math.abs(odd - even));
        } else {
            System.out.printf("Yes%nSum = %d", even);
        }
    }
}

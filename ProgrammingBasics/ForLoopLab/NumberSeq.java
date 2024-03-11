package ForLoopLab;

import java.util.Scanner;

public class NumberSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int robi = Integer.
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= firstNumber; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}

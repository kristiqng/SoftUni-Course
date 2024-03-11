package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        for (int i = firstNumber; i <= secondNumber; i++) {
            int odd = 0;
            int even = 0;
            int current = i;
            for (int j = 6; j >= 1; j--) {
                if (j % 2 == 0) {
                    int now = 0;
                    now = current % 10;
                    current = current / 10;
                    even += now;
                } else {
                    int now = 0;
                    now = current % 10;
                    current = current / 10;
                    odd += now;
                }
            }
            if (even == odd) {
                System.out.printf("%d ", i);
            }
        }
    }
}

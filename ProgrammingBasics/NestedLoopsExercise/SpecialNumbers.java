package NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            String numberI = "" + i;
            int plus = 0;
            for (int j = 0; j < 4; j++) {
                char symbol = numberI.charAt(j);
                int digit = symbol - '0';
                if (digit == 0) {
                    continue;
                }
                if (number % digit == 0) {
                    plus++;
                }
            }
            if (plus == 4) {
                System.out.printf("%d ", i);
            }
        }
    }
}

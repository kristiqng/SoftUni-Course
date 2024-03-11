package NestedLoopsLab;

import java.util.Scanner;

public class SumOFTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());

         int magicX = Integer.parseInt(scanner.nextLine());
        int counterTries = 0;
        int foundTries = 0;
        boolean isFound = false;
        int num1 = 0;
        int num2 = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = x1; j <= x2; j++) {
                if (isFound) {
                    break;
                }
                counterTries++;
                if (i + j == magicX) {
                    num1 = i;
                    num2 = j;
                    isFound = true;
                    foundTries = counterTries;
                    break;
                }
            }
        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", foundTries, num1, num2, magicX);
        }
        else {
            System.out.printf("%d combinations - neither equals %d", counterTries, magicX);
        }
    }
}

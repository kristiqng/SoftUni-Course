package BasicSyntaxCondiStatementsLoopsExercise_02;

import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine()); //// 145
        int firstNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            int a = 1;
            for (int i = 1; i <= digit; i++) {
                a = a * i;
            }
            sum += a;
            number /= 10;
        }
        if (sum == firstNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

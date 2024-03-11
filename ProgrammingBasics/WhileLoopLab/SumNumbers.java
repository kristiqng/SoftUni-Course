package WhileLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (firstNumber > sum) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            sum += inputNumber;

        }
        System.out.println(sum);
    }
}

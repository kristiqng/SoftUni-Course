package BasicSyntaxCondiStatementsLoopsLab;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int number = i * 2 - 1;
            sum += number;
            System.out.println(number);
        }
        System.out.println("Sum: " + sum);
    }
}

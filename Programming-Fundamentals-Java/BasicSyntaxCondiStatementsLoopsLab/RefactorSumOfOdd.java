package BasicSyntaxCondiStatementsLoopsLab;

import java.util.Scanner;

public class RefactorSumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i - 1);
            System.out.println();
            sum += 2 * i - 1;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}

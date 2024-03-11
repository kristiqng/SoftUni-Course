package BasicSyntaxCondiStatementsLoopsLab;

import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        do {
            int sum = a * b;
            System.out.printf("%d X %d = %d\n", a, b, sum);
            b+=1;
        }
        while (b <= 10);
    }
}

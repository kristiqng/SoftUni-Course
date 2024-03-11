package CondiStatementLab4;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double sum = 0;
        String number = "";
        boolean isDevide = symbol.equals("/");
        boolean isDevideTwo = symbol.equals("%");
        if ( b == 0 && symbol.equals("/") || b == 0 && symbol.equals("%")) {
            System.out.printf("Cannot divide %d by zero", a);
        } else {
            switch (symbol) {
                case "+":
                    sum = a + b;
                    break;
                case "-":
                    sum = a - b;
                    break;
                case "*":
                    sum = a * b;
                    break;
                case "/":
                    sum = (a / (b * 1.0)) ;
                    break;
                case "%":
                    sum = a % b;
                    break;
            }
            if (!isDevideTwo && !isDevide) {
                if (sum % 2 == 0) {
                    number = "even";
                    System.out.printf("%d %s %d = %.0f - %s", a, symbol, b, sum, number);
                } else {
                    number = "odd";
                    System.out.printf("%d %s %d = %.0f - %s", a, symbol, b, sum, number);
                }
            } else {
                if (symbol.equals("/")) {
                    System.out.printf("%d %s %d = %.2f", a, symbol, b, sum);
                } else {
                    System.out.printf("%d %s %d = %.0f", a, symbol, b, sum);
                }
            }
        }
    }
}

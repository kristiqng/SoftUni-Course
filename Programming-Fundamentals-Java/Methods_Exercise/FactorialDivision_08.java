package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        long num1Factorial = findFactorial(num1);
        long num2Factorial = findFactorial(num2);
        double result = num1Factorial * 1.0 / num2Factorial;
        System.out.printf("%.2f",result);
    }
    public static long findFactorial(long num1) {
        long result = 1;
        for (long i = num1; i > 0 ; i--) {
            result *= i;
        }
        return result;
    }
}

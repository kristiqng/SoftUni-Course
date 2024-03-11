package Methods_Exercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            boolean isDivisible = checkIsSumDivisibleBy8(i);
            boolean isOdd = checkIfNumberHasOddDigit(i);
            if (isDivisible && isOdd) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkIfNumberHasOddDigit(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
    public static boolean checkIsSumDivisibleBy8 (int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

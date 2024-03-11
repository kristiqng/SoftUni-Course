package Methods_Lab;

import java.util.Scanner;

public class MultiplyEvenByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds((Math.abs(number))));
    }
    public static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits (number);
        return evenSum * oddSum;
    }
    public static int getSumOfEvenDigits (int number) {
        int evenDigits = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenDigits += digit;
            }
            number /= 10;
        }
        return evenDigits;
    }
    public static int getSumOfOddDigits (int number) {
        int evenDigits = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                evenDigits += digit;
            }
            number /= 10;
        }
        return evenDigits;
    }
}

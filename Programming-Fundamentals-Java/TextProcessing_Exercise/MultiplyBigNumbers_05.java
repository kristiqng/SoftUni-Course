package TextProcessing_Exercise;

import java.util.Scanner;

public class MultiplyBigNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine().replaceAll("^0+", "");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber.isEmpty() || secondNumber == 0) {
            System.out.println("0");
            return;
        }

        char[] numberToMultiply = firstNumber.toCharArray();
        int carry = 0;
        StringBuilder finalNumber = new StringBuilder();

        for (int i = numberToMultiply.length - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(numberToMultiply[i]);
            int product = digit * secondNumber + carry;
            carry = product / 10;
            product %= 10;
            finalNumber.insert(0, product);
        }

        while (carry > 0) {
            finalNumber.insert(0, carry % 10);
            carry /= 10;
        }

        System.out.println(finalNumber);
    }
}
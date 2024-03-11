package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number ; i++) {
            String input = scanner.nextLine();
            String firstNumber = "";
            String secondNumber = "";
            boolean isSecond = false;
            for (int j = 0; j < input.length(); j++) {
                char digit = input.charAt(j);
                if (digit == ' ') {
                    isSecond = true;
                    continue;
                }
                if (!isSecond) {
                    firstNumber += digit;
                } else {
                    secondNumber += digit;
                }
            }
            long number1 = Long.parseLong(firstNumber);
            long number2 = Long.parseLong(secondNumber);
            long maxNumber = Math.abs(Math.max(number1, number2));
            long sum = 0;
            while (maxNumber > 0) {
                long currentDigit = maxNumber % 10;
                sum += currentDigit;
                maxNumber /= 10;
            }
            System.out.println(sum);
        }
    }
}

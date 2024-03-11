package TextProcessing_Exercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            String currentInput = input[i];
            char firstLetter = currentInput.charAt(0);
            char lastLetter = currentInput.charAt(currentInput.length() - 1);
            String digits = "";
            for (int j = 1; j < currentInput.length() - 1; j++) {
                digits += currentInput.charAt(j);
            }
            double number = Double.parseDouble(digits);
            if (Character.isLowerCase(firstLetter)) {
                number *= (int) firstLetter - 96;
            }
            if (Character.isUpperCase(firstLetter)) {
                number /= (int) firstLetter - 64;
            }
            if (Character.isLowerCase(lastLetter)) {
                number += (int) lastLetter - 96;
            }
            if (Character.isUpperCase(lastLetter)) {
                number -= (int) lastLetter - 64;
            }
            sum += number;
        }
        System.out.println(String.format("%.2f", sum));
    }
}

package TextProcessing_Lab;

import java.util.Scanner;

public class DigitsLettersAndOthers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else if (Character.isAlphabetic(ch)) {
                letters.append(ch);
            } else {
                others.append(ch);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}

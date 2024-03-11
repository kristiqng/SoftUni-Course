package TextProcessing_MoreExercise;

import java.util.Scanner;

public class AsciiSimulator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        int firstChar = first.charAt(0);
        int secondChar = second.charAt(0);
        int min = Math.min(firstChar, secondChar);
        int max = Math.max(firstChar, secondChar);
        int sum = 0;
        for (int i = 0; i < third.length(); i++) {
            int currentSymbol = third.charAt(i);
            if (currentSymbol > min && currentSymbol < max) {
                sum += currentSymbol;
            }
        }
        System.out.println(sum);
    }
}

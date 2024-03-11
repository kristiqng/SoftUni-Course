package Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMiddleCharacters(text);
    }
    public static void printMiddleCharacters(String text) {
        if (text.length() % 2 == 0) {
            System.out.print(text.charAt((text.length() / 2) - 1));
            System.out.print(text.charAt(text.length() / 2));
        } else {
            System.out.println(text.charAt(text.length() / 2));
        }
    }
}

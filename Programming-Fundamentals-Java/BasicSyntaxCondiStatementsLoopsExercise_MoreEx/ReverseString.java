package BasicSyntaxCondiStatementsLoopsExercise_MoreEx;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reverse = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            char digit = input.charAt(i);
            reverse += digit;
        }
        System.out.println(reverse);
    }
}

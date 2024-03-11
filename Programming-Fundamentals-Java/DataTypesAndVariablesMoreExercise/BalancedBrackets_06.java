package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isOpened = false;
        boolean isBalanced = true;
        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                if (!isOpened) {
                    isOpened = true;
                } else {
                    isBalanced = false;
                }
            }
            if (input.equals(")")) {
                if (isOpened) {
                    isOpened = false;
                } else {
                    isBalanced = false;
                }
            }
        }
        if (!isOpened && isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}

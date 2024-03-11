package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String type = "";
            if (input.equals("true") || input.equals("false")) {
                type = "boolean";
                //boolean
            } else if (input.length() == 1) {
                char ch = input.charAt(0);
                if (ch < 48 || ch > 57) {
                    type = "character";
                } else {
                    type = "integer";
                }
            }
            System.out.println(type);
            input = scanner.nextLine();
        }
    }
}

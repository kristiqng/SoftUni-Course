package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder_0101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            int valueIntInput = Integer.parseInt(input);
            String text = String.valueOf(valueIntInput);

            double valueDoubleInput = Double.parseDouble(input);
            String textDouble = Double.toString(valueDoubleInput);

            if (text.equals(input)) {
                System.out.println("integer");
            } else if (textDouble.equals(input)) {
                System.out.println("double");
            }
        }
    }
}

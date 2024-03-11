package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberA = Double.parseDouble(scanner.nextLine());
        double numberB = Double.parseDouble(scanner.nextLine());
        boolean isEqual =  Math.abs(numberA - numberB) < 0.000001;
        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

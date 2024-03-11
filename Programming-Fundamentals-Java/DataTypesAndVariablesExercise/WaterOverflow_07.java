package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int litersInTheTank = 0;
        for (int i = 0; i < lines; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            capacity -= quantities;
            if (capacity < 0) {
                capacity += quantities;
                System.out.println("Insufficient capacity!");
            } else {
                litersInTheTank += quantities;
            }
            if (i == lines - 1) {
                System.out.println(litersInTheTank);
            }
        }
    }
}

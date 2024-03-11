package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String best = "";
        double max = Double.MIN_VALUE;
        for (int i = 1; i <= number ; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius,2) * height;
            if (volume > max) {
                best = name;
                max = volume;
            }
        }
        System.out.println(best);
    }
}

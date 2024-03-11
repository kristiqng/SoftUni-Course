package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SnowBall_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        int first = 0;
        int second = 0;
        int third = 0;
        for (int i = 1; i <= number ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((double)(snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > max) {
                max = snowballValue;
                first = snowballSnow;
                second = snowballTime;
                third = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", first, second, max, third);
    }
}

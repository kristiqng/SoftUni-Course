package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int pointsWon = 0;
        double win = 0;
        for (int i = 1; i <= tournaments; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    startPoints+= 2000;
                    pointsWon+= 2000;
                    win++;
                    break;
                case "F":
                    pointsWon+= 1200;
                    startPoints+= 1200;
                    break;
                case "SF":
                    pointsWon += 720;
                    startPoints += 720;
                    break;
            }
        }
        double average = (pointsWon / tournaments) * 1.0;
        System.out.printf("Final points: %d%n", startPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(average));
        System.out.printf("%.2f%%",win / tournaments * 100);
    }
}

package CondiStatementLab4;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double trip = 0;
        String sleep = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    trip = budget * 0.30;
                    break;
                case "winter":
                    trip = budget * 0.70;
                    break;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    trip = budget * 0.40;
                    break;
                case "winter":
                    trip = budget * 0.80;
                    break;
            }
        } else {
            destination = "Europe";
            trip = budget * 0.90;
        }
        if (season.equals("summer") && budget <= 1000) {
            sleep = "Camp";
        } else if (season.equals("winter") && budget <= 1000) {
            sleep = "Hotel";
        } else {
            sleep = "Hotel";
        }
        System.out.printf("Somewhere in %s", destination);
        System.out.println();
        System.out.printf("%s - %.2f", sleep, trip);
    }
}

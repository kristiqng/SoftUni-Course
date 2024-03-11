package CondiStatementLab4;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double rent = 0;
        switch (season) {
            case "Spring":
                rent += 3000;
                break;
            case "Summer":
            case "Autumn":
                rent += 4200;
                break;
            case "Winter":
                rent += 2600;
                break;
        }
        if (fishers <= 6) {
            rent *= 0.90;
        } else if (fishers > 6 && fishers <= 11) {
            rent *= 0.85;
        } else {
            rent *= 0.75;
        }
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            rent *= 0.95;
        }
        if (rent > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        }
    }
}

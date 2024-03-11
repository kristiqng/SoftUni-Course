package CondiStatementLab4;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerName = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double total = 0;
        switch (flowerName){
            case "Roses" :
                total = flowerCount * 5.0;
                if (flowerCount > 80) {
                    total *= 0.90;
                }
                break;
            case "Dahlias":
                total = flowerCount * 3.80;
                if (flowerCount > 90) {
                    total *= 0.85;
                }
                break;
            case "Tulips":
                total = flowerCount * 2.80;
                if (flowerCount > 80) {
                    total *= 0.85;
                }
                break;
            case "Narcissus":
                total = flowerCount * 3.00;
                if (flowerCount < 120) {
                    total *= 1.15;
                }
                break;
            case "Gladiolus":
                total = flowerCount * 2.50;
                if (flowerCount < 80) {
                    total *= 1.20;
                }
                break;
        }
        if (budget >= total) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowerCount, flowerName, (budget - total));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", total - budget);
        }
    }
}

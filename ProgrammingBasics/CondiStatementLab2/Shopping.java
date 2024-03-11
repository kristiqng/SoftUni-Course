package CondiStatementLab2;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        double priceN = n * 250;
        double priceM = m * (priceN * 0.35);
        double priceP = p * (priceN * 0.10);
        double total = priceN + priceM + priceP;
        if (n > m) {
            total *= 0.85;
        }
        if (budget >= total) {
            System.out.printf("You have %.2f leva left!", (budget - total));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!",(total - budget));
        }
    }
}

package CondiStatementLab2;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int person = Integer.parseInt(scanner.nextLine());
        double dressPerPerson = Double.parseDouble(scanner.nextLine());
        double decoration = budget * 0.10;
        double dressPrice = dressPerPerson * person;
        if (person > 150) {
            dressPrice *= 0.90;
        }
        double total = dressPrice + decoration;
        if (budget >= total) {
            budget = budget - total;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget);
        }
        else {
            budget = total - budget;
            System.out.println("Not enough money! ");
            System.out.printf("Wingard needs %.2f leva more.", budget);
        }
    }
}

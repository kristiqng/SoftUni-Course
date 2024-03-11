package CondiStatementLab2;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double trip = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        int toys = puzzle + dolls + bears + minions + trucks;
        double totalPrice = (puzzle * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);
        if (toys >= 50) {
            totalPrice = totalPrice * 0.75;
        }
        double priceWithRent = totalPrice * 0.90;
        if (priceWithRent >= trip) {
            priceWithRent = priceWithRent - trip;
            System.out.printf("Yes! %.2f lv left.", priceWithRent);
        } else {
            priceWithRent = trip - priceWithRent;
            System.out.printf("Not enough money! %.2f lv needed.", priceWithRent);
        }
    }
}

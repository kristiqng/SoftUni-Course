package ProgrammingFundamentalsMidExams;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double price = 0;
        double tax = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double currentPrice = Double.parseDouble(input);
            if (currentPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                price += currentPrice;
                tax += currentPrice * 0.20;
            }
            input = scanner.nextLine();
        }
        if (price == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", price);
            System.out.printf("Taxes: %.2f$%n",tax);
            System.out.println("-----------");
            if (input.equals("special")) {
                System.out.printf("Total price: %.2f$", (price + tax) * 0.90);
            } else {
                System.out.printf("Total price: %.2f$", (price + tax));
            }
        }
    }
}

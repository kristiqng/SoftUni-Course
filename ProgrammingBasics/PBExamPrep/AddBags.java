package PBExamPrep;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double overTwenty = Double.parseDouble(scanner.nextLine());
        double luggageWeight = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());
        double luggagePrice = 0;
        if (luggageWeight < 10) {
            luggagePrice += overTwenty * 0.20;
        } else if (luggageWeight >= 10 && luggageWeight <= 20) {
            luggagePrice += overTwenty * 0.50;
        } else {
            luggagePrice = overTwenty;
        }
        if (days > 30) {
            luggagePrice *= 1.10;
        } else if (days >= 7 && days <= 30) {
            luggagePrice *= 1.15;
        } else if (days < 7) {
            luggagePrice *= 1.40;
        }
        System.out.printf("The total price of bags is: %.2f lv.", luggagePrice * luggageCount);
    }
}

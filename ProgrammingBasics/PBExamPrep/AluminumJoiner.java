package PBExamPrep;

import java.util.Scanner;

public class AluminumJoiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int joinerCount = Integer.parseInt(scanner.nextLine());
        String joinerType = scanner.nextLine();
        String typeDelivery = scanner.nextLine();
        double priceForOne = 0;
        if (joinerCount < 10) {
            System.out.printf("Invalid order");
        } else {
            switch (joinerType) {
                case "90X130":
                    priceForOne += 110;
                    if (joinerCount > 30 && joinerCount <= 60) {
                        priceForOne *= 0.95;
                    } else if (joinerCount > 60) {
                        priceForOne *= 0.92;
                    }
                    break;
                case "100X150":
                    priceForOne += 140;
                    if (joinerCount > 40 && joinerCount <= 80) {
                        priceForOne *= 0.94;
                    } else if (joinerCount > 80) {
                        priceForOne *= 0.90;
                    }
                    break;
                case "130X180":
                    priceForOne += 190;
                    if (joinerCount > 20 && joinerCount <= 50) {
                        priceForOne *= 0.93;
                    } else if (joinerCount > 50) {
                        priceForOne *= 0.88;
                    }
                    break;
                case "200X300":
                    priceForOne += 250;
                    if (joinerCount > 25 && joinerCount <= 50) {
                        priceForOne *= 0.91;
                    } else if (joinerCount > 50) {
                        priceForOne *= 0.86;
                    }
                    break;
            }
            double total = priceForOne * joinerCount;
            if (typeDelivery.equals("With delivery")) {
                total += 60;
            }
            if (joinerCount > 99) {
                total *= 0.96;
            }
            System.out.printf("%.2f BGN", total);
        }
    }
}

package BasicSyntaxCondiStatementsLoopsExercise_02;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double moneyIN = 0;
        while (!input.equals("Start")) {
            double digitInput = Double.parseDouble(input);
            switch (input) {
                case "0.1":
                    moneyIN += 0.1;
                    break;
                case "0.2":
                    moneyIN += 0.2;
                    break;
                case "0.5":
                    moneyIN += 0.5;
                    break;
                case "1":
                    moneyIN += 1;
                    break;
                case "2":
                    moneyIN += 2;
                    break;
                default:
                    System.out.printf("Cannot accept %.2f\n", digitInput);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            double productPrice = 0;
            boolean isInvalid = false;
            switch (product) {
                case "Nuts":
                    productPrice += 2.0;
                    break;
                case "Water":
                    productPrice += 0.7;
                    break;
                case "Crisps":
                    productPrice += 1.5;
                    break;
                case "Soda":
                    productPrice +=0.8;
                    break;
                case "Coke":
                    productPrice += 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    isInvalid = true;
                    break;
            }
            if (isInvalid) {
                product = scanner.nextLine();
                continue;
            }
            if (moneyIN - productPrice >= 0) {
                moneyIN -= productPrice;
                System.out.println("Purchased " + product);
            } else {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", moneyIN);
    }
}

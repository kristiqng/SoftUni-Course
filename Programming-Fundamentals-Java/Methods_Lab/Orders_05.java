package Methods_Lab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;
        price(product, price, count);
    }
    public static void price (String product, double price, int count) {
        switch (product) {
            case "coffee" :
                price += 1.50;
                break;
            case "water":
                price += 1.00;
                break;
            case "coke":
                price += 1.40;
                break;
            case "snacks":
                price += 2.00;
                break;
        }
        System.out.printf("%.2f", price * count);
    }
}

package ForLoopExercise;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWash = Double.parseDouble(scanner.nextLine());
        int toysPrice = scanner.nextInt();
        int toysCount = 0;
        double girlSum = 0;
        double money = 0;
        for (int i = 1; i <= age ; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                girlSum += money - 1;
            } else {
                toysCount++;
            }
        }
        double total = girlSum + (toysCount * toysPrice);
        if (total > priceWash) {
            System.out.printf("Yes! %.2f", total - priceWash);
        } else {
            System.out.printf("No! %.2f", priceWash - total);
        }
    }
}
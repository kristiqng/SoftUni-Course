package MyFundamentalsExam;

import java.util.Scanner;

public class Burger_Bus_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cities = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;
        for (int i = 1; i <= cities; i++) {
            double profit = 0;
            String cityName = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            if (i % 3 == 0 && i % 5 == 0) {
                income *= 0.90;
            }
            else if (i % 3 == 0) {
                expenses *= 1.5;
            } else if (i % 5 == 0) {
                income *= 0.90;
            }
            profit += income - expenses;
            totalProfit += profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}

package NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        double budget = 0;
        while (!destination.equals("End")) {
            double cost = Double.parseDouble(scanner.nextLine());
            while (budget < cost) {
                double money = Double.parseDouble(scanner.nextLine());
                budget += money;
            }
            if (budget >= cost) {
                System.out.printf("Going to %s!%n", destination);
            }
            destination = scanner.nextLine();
            budget = 0;
        }

    }
}

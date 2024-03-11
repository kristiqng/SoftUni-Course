package PBExamPrep;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String companyName = scanner.nextLine();
        int oldTickets = Integer.parseInt(scanner.nextLine());
        int youngTickets = Integer.parseInt(scanner.nextLine());
        double oldPrice = Double.parseDouble(scanner.nextLine());
        double taxService = Double.parseDouble(scanner.nextLine());
        double youngPrice = oldPrice * 0.30;
        double total = oldTickets * (oldPrice + taxService) + youngTickets * (youngPrice + taxService);
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, total * 0.20);
    }
}

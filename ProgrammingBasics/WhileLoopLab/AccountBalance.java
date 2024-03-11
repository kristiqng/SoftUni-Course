package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double all = 0;
        while (!input.equals("NoMoreMoney")) {
            double cash = Double.parseDouble(input);
            if (cash < 0) {
                System.out.println("Invalid operation!");
                System.out.printf("Total: %.2f", all);
                break;
            }
            all += cash;
            System.out.printf("Increase: %.2f%n", cash);
            input = scanner.nextLine();
        }
        if (input.equals("NoMoreMoney")) {
            System.out.printf("Total: %.2f", all);
        }
    }
}

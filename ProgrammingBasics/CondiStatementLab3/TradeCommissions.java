package CondiStatementLab3;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());
        if (number >= 0 && number <= 500) {
            switch (city) {
                case "Sofia" :
                    System.out.printf("%.2f", number * 0.05);
                    break;
                case "Varna" :
                    System.out.printf("%.2f", number * 0.045);
                    break;
                case "Plovdiv" :
                    System.out.printf("%.2f", number * 0.055);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (number > 500 && number <= 1000) {
            switch (city) {
                case "Sofia" :
                    System.out.printf("%.2f", number * 0.07);
                    break;
                case "Varna" :
                    System.out.printf("%.2f", number * 0.075);
                    break;
                case "Plovdiv" :
                    System.out.printf("%.2f", number * 0.08);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (number > 1000 && number <= 10000) {
            switch (city) {
                case "Sofia" :
                    System.out.printf("%.2f", number * 0.08);
                    break;
                case "Varna" :
                    System.out.printf("%.2f", number * 0.10);
                    break;
                case "Plovdiv" :
                    System.out.printf("%.2f", number * 0.12);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (number > 10000) {
            switch (city) {
                case "Sofia" :
                    System.out.printf("%.2f", number * 0.12);
                    break;
                case "Varna" :
                    System.out.printf("%.2f", number * 0.13);
                    break;
                case "Plovdiv" :
                    System.out.printf("%.2f", number * 0.145);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}

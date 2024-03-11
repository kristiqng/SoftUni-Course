package CondiStatementLab4;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        double all = r * k * 1.0;
        switch (ticket) {
            case "Premiere":
                System.out.printf("%.2f leva.", all * 12.00);
                break;
            case "Normal":
                System.out.printf("%.2f leva.", all * 7.50);
                break;
            case "Discount":
                System.out.printf("%.2f leva.", all * 5.00);
                break;
        }
    }
}

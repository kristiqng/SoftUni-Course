package FirstStepsInCodingLab2;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double deposit = Double.parseDouble(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double sum = deposit + time * ((deposit * percent * 0.01) / 12);
        System.out.println(sum);

    }
}

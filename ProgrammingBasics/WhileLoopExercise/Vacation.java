package WhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int spendDay = 0;
        int days = 0;
        while (availableMoney < neededMoney) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            days++;
            switch (action) {
                case "save":
                        availableMoney += money;
                        spendDay = 0;
                        if (availableMoney >= neededMoney) {
                            System.out.printf("You saved the money for %d days.", days);
                            break;
                        }
                    break;
                case "spend":
                    availableMoney -= money;
                    spendDay++;
                        if (availableMoney < 0) {
                            availableMoney = 0;
                    }
                    if (spendDay == 5){
                        System.out.printf("You can't save the money.%n");
                        System.out.printf("%d", spendDay);
                        break;
                    }
                    break;
            }

        }
    }
}

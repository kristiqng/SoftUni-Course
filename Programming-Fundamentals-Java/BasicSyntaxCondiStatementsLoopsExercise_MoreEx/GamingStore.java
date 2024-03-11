package BasicSyntaxCondiStatementsLoopsExercise_MoreEx;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double spend = 0;
        while (!game.equals("Game Time")) {
            double price = 0;
            switch (game) {
                case "OutFall 4":
                    price = 39.99;
                    if (money - price < 0) {
                        System.out.println("Too Expensive");
                        game = scanner.nextLine();
                        continue;
                    }
                    System.out.println("Bought " + game);
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (money - price < 0) {
                        System.out.println("Too Expensive");
                        game = scanner.nextLine();
                        continue;
                    }
                    System.out.println("Bought " + game);
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (money - price < 0) {
                        System.out.println("Too Expensive");
                        game = scanner.nextLine();
                        continue;
                    }
                    System.out.println("Bought " + game);
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (money - price < 0) {
                        System.out.println("Too Expensive");
                        game = scanner.nextLine();
                        continue;
                    }
                    System.out.println("Bought " + game);
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (money - price < 0) {
                        System.out.println("Too Expensive");
                        game = scanner.nextLine();
                        continue;
                    }
                    System.out.println("Bought " + game);
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (money - price < 0) {
                        System.out.println("Too Expensive");
                        game = scanner.nextLine();
                        continue;
                    }
                    System.out.println("Bought " + game);
                    break;
                default:
                    System.out.println("Not found");
                    break;
            }
            money -= price;
            spend += price;
            if (money == 0) {
                System.out.println("Out of money");
                return;
            }
            game = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spend, money);
    }
}

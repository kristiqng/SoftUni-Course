package BasicSyntaxCondiStatementsLoopsExercise_02;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String ticketType = scanner.nextLine();
        String day = scanner.nextLine();
        double pricePerPerson = 0;
        if (ticketType.equals("Students")) {
            if (day.equals("Friday")) {
                pricePerPerson = 8.45;
            } else if (day.equals("Saturday")) {
                pricePerPerson = 9.80;
            } else if (day.equals("Sunday")) {
                pricePerPerson = 10.46;
            }
            if (people >= 30) {
                pricePerPerson *= 0.85;
            }
        } else if (ticketType.equals("Business")) {
            if (day.equals("Friday")) {
                pricePerPerson = 10.90;
            } else if (day.equals("Saturday")) {
                pricePerPerson = 15.60;
            } else if (day.equals("Sunday")) {
                pricePerPerson = 16;
            }
            if (people >= 100) {
                people -= 10;
            }
        } else if (ticketType.equals("Regular")) {
            if (day.equals("Friday")) {
                pricePerPerson = 15;
            } else if (day.equals("Saturday")) {
                pricePerPerson = 20;
            } else if (day.equals("Sunday")) {
                pricePerPerson = 22.50;
            }
            if (people >= 10 && people <= 20) {
                pricePerPerson *= 0.95;
            }
        }
        double total = pricePerPerson * people;
        System.out.printf("Total price: %.2f", total);
    }
}

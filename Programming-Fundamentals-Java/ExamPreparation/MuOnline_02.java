package ExamPreparation;

import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        int bestRoom = 0;
        String[] rooms = scanner.nextLine().split("\\|");
        for (int i = 0; i < rooms.length; i++) {
            bestRoom++;
            String[] room = rooms[i].split(" ");
            String command = room[0];
            String points = room[1];
            switch (command) {
                case "potion":
                    health += Integer.parseInt(points);
                    if (health > 100) {
                        System.out.printf("You healed for %s hp.%n", 100 - (health - Integer.parseInt(points)));
                        health = 100;
                        System.out.printf("Current health: %d hp.%n", health);
                    } else {
                        System.out.printf("You healed for %s hp.%n", points);
                        System.out.printf("Current health: %d hp.%n", health);
                    }
                    break;
                case "chest":
                    System.out.printf("You found %s bitcoins.%n", points);
                    bitcoins += Integer.parseInt(points);
                    break;
                default:
                    health -= Integer.parseInt(points);
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    }
                    if (health <= 0) {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", bestRoom);
                        return;
                    }
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %s", health);
    }
}

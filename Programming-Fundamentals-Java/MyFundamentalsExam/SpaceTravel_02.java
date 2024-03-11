package MyFundamentalsExam;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceTravel_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] travelRoute = scanner.nextLine().split("\\|\\|");
        int fuel  = Integer.parseInt(scanner.nextLine());
        int ammo = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < travelRoute.length; i++) {
            String[] input = travelRoute[i].split(" ");
            String command = input[0];
                switch (command) {
                    case "Travel":
                        int lightYears = Integer.parseInt(input[1]);
                        if (fuel - lightYears >= 0) {
                            fuel -= lightYears;
                            System.out.printf("The spaceship travelled %d light-years.%n", lightYears);
                        } else {
                            System.out.println("Mission failed.");
                            return;
                        }
                        break;
                    case "Enemy":
                        int enemyArmour = Integer.parseInt(input[1]);
                        ammo -= enemyArmour;
                        if (ammo >= 0) {
                            System.out.printf("An enemy with %d armour is defeated.%n", enemyArmour);
                        } else {
                            int fuelForEscape = enemyArmour * 2;
                            if (fuel - fuelForEscape >= 0) {
                                ammo = 0;
                                fuel -= fuelForEscape;
                                System.out.printf("An enemy with %d armour is outmaneuvered.%n", enemyArmour);
                            } else {
                                System.out.println("Mission failed.");
                                return;
                            }
                        }
                        break;
                    case "Repair":
                        int pointsAdd = Integer.parseInt(input[1]);
                        fuel += pointsAdd;
                        ammo += pointsAdd * 2;
                        System.out.printf("Ammunitions added: %d.%n", pointsAdd * 2);
                        System.out.printf("Fuel added: %d.%n", pointsAdd);
                        break;
                    case "Titan":
                            System.out.print("You have reached Titan, all passengers are safe.");
                            return;
                }
            }
        }
    }


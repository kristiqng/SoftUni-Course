package PBExamPrep;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double points = 0;
        int otherColors = 0;
        int blackColors = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        for (int i = 1; i <= number ; i++) {
            String color = scanner.nextLine();
            if (color.equals("red") || color.equals("orange") || color.equals("yellow") || color.equals("white")) {
                switch (color) {
                    case "red":
                        points += 5;
                        redBalls++;
                        break;
                    case "orange":
                        points += 10;
                        orangeBalls++;
                        break;
                    case "yellow":
                        yellowBalls++;
                        points += 15;
                        break;
                    case "white":
                        whiteBalls++;
                        points += 20;
                        break;
                }
            } else if (color.equals("black")) {
                points = Math.floor(points / 2);
                blackColors++;
            } else {
                otherColors++;
                continue;
            }
        }
        System.out.printf("Total points: %.0f%n", points);
        System.out.println("Red balls: " + redBalls);
        System.out.println("Orange balls: " + orangeBalls);
        System.out.println("Yellow balls: " + yellowBalls);
        System.out.println("White balls: " + whiteBalls);
        System.out.println("Other colors picked: " + otherColors);
        System.out.println("Divides from black balls: " + blackColors);
    }
}

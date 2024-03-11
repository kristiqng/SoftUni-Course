package PBExamPrep;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int bestScore = Integer.MIN_VALUE;
        String bestPlayer = "";
        boolean isMore = false;
        while (!name.equals("END")) {
            int score = Integer.parseInt(scanner.nextLine());
            if (score > bestScore) {
                bestScore = score;
                bestPlayer = name;
            }
            if (score >= 10) {
                isMore = true;
                break;
            }
            name = scanner.nextLine();
        }
        if (isMore) {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestScore);
        } else {
            System.out.printf("%s is the best player!%n", bestPlayer);
            if (bestScore >= 3) {
                System.out.printf("He has scored %d goals and made a hat-trick !!!", bestScore);
            } else {
                System.out.printf("He has scored %d goals.", bestScore);
            }
        }
    }
}

package NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int student = 0;
        int standard = 0;
        int kid = 0;
        int total = 0;
        while (!movieName.equals("Finish")) {
            int freeSpots = Integer.parseInt(scanner.nextLine());
            int movieCount = 0;
            for (int i = 1; i <= freeSpots; i++) {
                String ticket = scanner.nextLine();
                if (ticket.equals("End")) {
                    break;
                } else {
                    movieCount++;
                    switch (ticket) {
                        case "student":
                            student++;
                            total ++;
                            break;
                        case "standard":
                            standard++;
                            total++;
                            break;
                        case "kid":
                            kid++;
                            total++;
                            break;
                    }
                }
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, (movieCount * 100.0) / freeSpots);
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", total);
        System.out.printf("%.2f%% student tickets.%n", (student * 100.0) / total);
        System.out.printf("%.2f%% standard tickets.%n", (standard * 100.0) / total);
        System.out.printf("%.2f%% kids tickets.", (kid * 100.0)/ total);
    }
}

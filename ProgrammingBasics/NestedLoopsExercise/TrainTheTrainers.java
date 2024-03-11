package NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String subject = scanner.nextLine();
        double allClasses = 0;
        int allClassesPeople = 0;
        while (!subject.equals("Finish")) {
            double total = 0;
            for (int i = 1; i <= people; i++) {
                double points = Double.parseDouble(scanner.nextLine());
                total += points;
            }
            System.out.printf("%s - ", subject);
            System.out.printf("%.2f.%n", total / people);
            allClasses += total;
            allClassesPeople += people;
            subject = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allClasses / allClassesPeople);
    }
}

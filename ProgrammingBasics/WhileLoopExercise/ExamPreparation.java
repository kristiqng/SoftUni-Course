package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int downGrades = Integer.parseInt(scanner.nextLine());
        String task = scanner.nextLine();
        int taskCount = 0;
        boolean isEnough = true;
        double sumTaskGrades = 0;
        int badTaskCount = 0;
        String lastProblem = "";
        while (!task.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            taskCount++;
            sumTaskGrades += grade;
            if (grade <= 4) {
                badTaskCount++;
            }
            if (badTaskCount == downGrades) {
                isEnough = false;
                break;
            }
            lastProblem = task;
            task = scanner.nextLine();
        }
        if (!isEnough) {
            System.out.printf("You need a break, %d poor grades.", badTaskCount);
        } else {
            System.out.printf("Average score: %.2f%n", sumTaskGrades / taskCount);
            System.out.printf("Number of problems: %d%n", taskCount);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}

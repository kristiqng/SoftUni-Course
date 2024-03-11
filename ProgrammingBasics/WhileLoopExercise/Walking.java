package WhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        int steps = 0;
        boolean isReached = false;
        while (steps < goal) {
            String dailySteps = scanner.nextLine();
            if (dailySteps.equals("Going home")) {
                int homeSteps = Integer.parseInt(scanner.nextLine());
                steps += homeSteps;
                if (steps >= goal) {
                    isReached = true;
                    break;
                }
                break;
            }
            int number = Integer.parseInt(dailySteps);
            steps += number;
            if (steps >= goal) {
                isReached = true;
                break;
            }
        }
        if (isReached) {
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!", steps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - steps);
        }
    }
}

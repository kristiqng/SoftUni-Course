package ForLoopExercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judgeCount = Integer.parseInt(scanner.nextLine());
        double neededPoints = 1250.5;
        for (int i = 1; i <= judgeCount; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            academyPoints += ((judgeName.length()) * judgePoints) / 2.0;
            if (academyPoints >= neededPoints) {
                System.out.printf("Congratulations, %s" +
                        " got a nominee for leading role with %.1f!",name, academyPoints);
                break;
            }
        }
        if (neededPoints > academyPoints) {
            System.out.printf("Sorry, %s you need %.1f more!",name,  neededPoints - academyPoints);
        }
    }
}

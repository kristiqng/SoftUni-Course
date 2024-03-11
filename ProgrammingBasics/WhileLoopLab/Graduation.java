package WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = 0;
        double sum = 0;
        int badGrade = 0;
        while (grade != 12) {
            double gradeForClass = Double.parseDouble(scanner.nextLine());
            sum += gradeForClass;
            if (gradeForClass < 4.00) {
                badGrade += 1;
            }
            if (badGrade == 2) {
                System.out.printf("%s has been excluded at %d grade", name, grade);
                break;
            }
            grade += 1;
        }
        if (grade == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / grade);
        }
    }
}

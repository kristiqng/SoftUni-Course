package Methods_MoreExercise;

import java.util.Scanner;

public class CenterPoints_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int smallerX = checkingTheDistance(x1,x2);
        int smallerY = checkingTheDistance(y1,y2);
        System.out.printf("(%d, %d)", smallerX,smallerY);
    }
    public static int checkingTheDistance (int num1, int num2) {
        if (Math.abs(num1) == Math.abs(num2)) {
            return num1;
        }
        if (Math.abs(num1) < Math.abs(num2)) {
            return num1;
        } else {
            return num2;
        }
    }
}

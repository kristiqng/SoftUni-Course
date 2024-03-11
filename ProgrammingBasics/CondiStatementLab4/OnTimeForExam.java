package CondiStatementLab4;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());
        int exam = (examHour * 60) + examMin;
        int arrive = (arriveHour * 60) + arriveMin;
        int difference = 0;
        if (arrive > exam) {
            System.out.println("Late");
            if (arrive - exam > 59) {
                difference = arrive - exam;
                System.out.printf("%d:%02d hours after the start", difference / 60, difference % 60);
            } else {
                difference = arrive - exam;
                System.out.printf("%d minutes after the start", difference);
            }
        }
        if (exam - arrive <= 30 && exam - arrive >= 0) {
            difference = exam - arrive;
            System.out.printf("On time %d minutes before the start", difference);
        }
        if (exam - arrive > 30) {
            difference = exam - arrive;
            if (difference < 60) {
                System.out.printf("Early %d minutes before the start" , difference);
            } else {
                difference = exam - arrive;
                System.out.printf("Early %d:%02d hours before the start", difference / 60, difference % 60);
            }
        }
    }
}

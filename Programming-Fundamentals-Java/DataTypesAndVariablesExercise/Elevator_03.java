package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine()); // 2
        int capacity = Integer.parseInt(scanner.nextLine()); // 3
        int courses = 0;  //5
        while (people > 0) {
            courses += 1;
            people -= capacity;
        }
        System.out.println(courses);
    }
}

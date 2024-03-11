package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator_03_Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int sum = (int) Math.ceil((double)people / capacity);
        System.out.println(sum);
    }
}

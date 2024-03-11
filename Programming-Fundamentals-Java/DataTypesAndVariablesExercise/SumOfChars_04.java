package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            char ch = scanner.nextLine().charAt(0);
            sum += ch;
        }
        String total = String.format("The sum equals: %s", sum);
        System.out.println(total);
    }
}

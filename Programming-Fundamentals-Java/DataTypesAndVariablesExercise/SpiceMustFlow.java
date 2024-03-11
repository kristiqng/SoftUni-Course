package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int extracted = 0;
        int days = 0;
        int consumed = 0;
        while (yield >= 100) {
            extracted += yield;
            extracted -= 26;
            consumed += 26;
            yield -= 10;
            days += 1;
        }
        extracted -= 26;
        if (consumed > extracted) {
            extracted += 26;
        }
        System.out.println(days);
        System.out.println(extracted);
    }
}

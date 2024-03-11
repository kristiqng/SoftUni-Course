package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        String text = "";
        for (int i = 0; i < number; i++) {
            char ch = scanner.nextLine().charAt(0);
            int digit = ch + key;
            text += (char)digit;
        }
        System.out.println(text);
    }
}

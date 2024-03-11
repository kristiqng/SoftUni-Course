package BasicSyntaxCondiStatementsLoopsExercise_02;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        //Acer
        //0123
        for (int i = username.length() - 1; i >= 0;  i--) {
            char current = username.charAt(i);
            password += current;
        }
        String input = scanner.nextLine();
        int wrongPassword = 0;
        while (!input.equals(password)) {
            wrongPassword += 1;
            if (wrongPassword == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.printf("Incorrect password. Try again.\n");
            input = scanner.nextLine();
        }
        if (input.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}

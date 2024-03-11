package TextProcessing_Exercise;

import java.util.Scanner;

public class ValidUsername_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] passwords = scanner.nextLine().split(", ");
        for (String password : passwords) {
            if (passwordIsValid(password)) {
                System.out.println(password);
            }
        }
    }

    public static boolean passwordIsValid(String password) {
        boolean isEnough = false;
        boolean isValid = true;
        if (password.length() >= 3 && password.length() <= 16) {
            isEnough = true;
        }
        for (char ch : password.toCharArray()) {
            if (!Character.isDigit(ch) && !Character.isAlphabetic(ch) && ch != '-' && ch != '_') {
                isValid = false;
            }
        }
        if (!isEnough || !isValid) {
            return false;
        }
        return true;
    }
}

package Methods_Exercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isLongEnough = checkingPasswordLenght(password);
        boolean isCorrectCharacters = checkingCorrectCharacters(password);
        boolean isEnough = checkingTwoDigits(password);
        if (isEnough && isLongEnough && isCorrectCharacters) {
            System.out.println("Password is valid");
        }
    }
    public static boolean checkingPasswordLenght(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }
    public static boolean checkingCorrectCharacters(String password){
        for (char symbol : password.toCharArray()
             ) {
            if (symbol > 47 && symbol < 58 || symbol > 64 && symbol < 91 || symbol > 96 && symbol < 123) {
                continue;
            } else {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }
    public static boolean checkingTwoDigits(String password) {
        int digitCounter = 0;
        for (char symbol : password.toCharArray()
             ) {
            if (symbol > 47 && symbol < 58) {
                digitCounter++;
            }
        }
        if (digitCounter >= 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}

package Methods_Exercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        while (!number.equals("END")) {
            isNumberPalindrome(number);
            number = scanner.nextLine();
        }
    }
    public static void isNumberPalindrome (String number) {
        String numberBackwards = "";
        for (int i = number.length() - 1; i >= 0 ; i--) {
            numberBackwards += number.charAt(i);
        }
        if (numberBackwards.equals(number)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

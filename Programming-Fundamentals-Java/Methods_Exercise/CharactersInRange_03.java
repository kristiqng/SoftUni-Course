package Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        printCharactersInRange(a, b);
    }
    public static void printCharactersInRange(char a, char b) {
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}

package Methods_Lab;

import java.util.Scanner;

public class SignOfIntegerNumber_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberIs(Integer.parseInt(scanner.nextLine()));
    }
    public static void numberIs(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        } else {
            System.out.printf("The number %d is negative.", number);
        }
    }
}

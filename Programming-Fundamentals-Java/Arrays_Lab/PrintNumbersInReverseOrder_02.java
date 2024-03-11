package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] number = new int[n];
        int[] reversedNumber = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(scanner.nextLine());
            ;
            reversedNumber[(number.length - 1) - i] = number[i];
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(reversedNumber[i]);
            if (i < reversedNumber.length - 1) {
                System.out.print(" ");
            }
        }
    }
}

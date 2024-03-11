package Arrays_Exercise;

import java.util.Scanner;

public class MagicNumber_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine().split(" ");
        int magicNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int numberOne = Integer.parseInt(numbers[i]);
                int numberTwo = Integer.parseInt(numbers[j]);
                if (numberOne + numberTwo == magicNumber) {
                    System.out.print(numbers[i] + " " + numbers[j]);
                    System.out.println();
                }
            }
        }
    }
}

package Arrays_Exercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= rotations ; i++) {
            //1   2    3     4      5
            String firstNumber = numbers[0];
            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = firstNumber;
        }
        for (String number : numbers
             ) {
            System.out.print(number + " ");
        }
    }
}

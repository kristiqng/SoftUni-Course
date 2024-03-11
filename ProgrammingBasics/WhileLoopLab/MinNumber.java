package WhileLoopLab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int biggestNumber = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int number = 0;
            number = Integer.parseInt(input);
            if (number < biggestNumber) {
                biggestNumber = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(biggestNumber);
    }
}

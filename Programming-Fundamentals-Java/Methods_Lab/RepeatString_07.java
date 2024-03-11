package Methods_Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatInput(input,number));
    }
    public static String repeatInput (String input, int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result += input;
        }
        return result;
    }
}

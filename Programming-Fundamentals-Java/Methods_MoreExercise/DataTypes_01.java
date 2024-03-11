package Methods_MoreExercise;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String secondInput = scanner.nextLine();
        checkDataType(input, secondInput);
    }
    public static void checkDataType(String input, String secondInput) {
        switch (input) {
            case "int":
                System.out.println(Integer.parseInt(secondInput) * 2);
                break;
            case "real":
                System.out.printf("%.2f", Double.parseDouble(secondInput) * 1.5);
                break;
            case "string":
                System.out.printf("$%s$", secondInput);
                break;
        }
    }
}

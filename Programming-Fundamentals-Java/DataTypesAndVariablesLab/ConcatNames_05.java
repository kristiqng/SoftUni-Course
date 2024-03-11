package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String sign = scanner.nextLine();
        String all = String.format("%s%s%s", firstName, sign, secondName);
        System.out.println(all);
    }
}

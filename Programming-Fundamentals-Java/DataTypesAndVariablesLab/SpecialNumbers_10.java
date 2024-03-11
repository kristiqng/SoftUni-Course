package DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine()); //15
        for (int i = 1; i <= number ; i++) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> " + "True");
            } else {
                System.out.println(i + " -> " + "False");
            }
        }
    }
}

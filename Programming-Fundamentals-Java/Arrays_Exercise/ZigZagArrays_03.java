package Arrays_Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String [] firstNumbers = new String[n];
        String [] secondNumbers = new String[n];
        for (int i = 1; i <= n; i++) {
            String [] currentNumbers = scanner.nextLine().split(" ");
            String numberOnZero = currentNumbers[0];
            String numberOnFirst = currentNumbers[1];
            if (i % 2 != 0) {
                firstNumbers[i - 1] = numberOnZero;
                secondNumbers [i - 1] = numberOnFirst;
            } else {
                firstNumbers[i - 1] = numberOnFirst;
                secondNumbers[i - 1] = numberOnZero;
            }
        }
        System.out.println(String.join(" ", firstNumbers));
        System.out.println(String.join(" ", secondNumbers));
    }
}

package WhileLoopLab;

import java.util.Scanner;

public class Sum2kplus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int n = 1;
        while (number >= n) {
            System.out.println(n);
            n = n + n + 1;
        }
    }
}

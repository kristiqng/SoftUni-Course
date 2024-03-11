package ForLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for(int i = 1; i <= firstNumber; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            sum += n;
        }
        System.out.println(sum);
    }
}

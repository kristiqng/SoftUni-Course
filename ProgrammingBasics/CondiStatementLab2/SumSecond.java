package CondiStatementLab2;

import java.util.Scanner;

public class SumSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int sum = a + b + c;
        int minutes = sum / 60;
        int second = sum % 60;
        if (second < 10){
            System.out.printf("%d:0%d", minutes, second);
        } else {
            System.out.printf("%d:%d", minutes, second);
        }
    }
}

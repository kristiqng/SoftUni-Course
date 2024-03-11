package BasicSyntaxCondiStatementsLoopsLab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isEven = n % 2 == 0;
        while (!isEven) {
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0) {
                break;
            }
        }
        System.out.printf("The number is: %d", Math.abs(n));
    }
}

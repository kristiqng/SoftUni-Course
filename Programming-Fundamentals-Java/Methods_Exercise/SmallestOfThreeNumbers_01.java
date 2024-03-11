package Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        smallestNumber(n1, n2, n3);
    }
    public static void smallestNumber (int n1, int n2, int n3) {
        System.out.println(Integer.min(Integer.min(n1,n2), n3));
    }
}

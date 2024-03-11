package Arrays_Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        String [] people = new String[n];
        for (int i = 0; i < n ; i++) {
            people[i] = scanner.nextLine();
            sum += Integer.parseInt(people[i]);
        }
        System.out.print(String.join(" ", people));
        System.out.println();
        System.out.print(sum);
    }
}

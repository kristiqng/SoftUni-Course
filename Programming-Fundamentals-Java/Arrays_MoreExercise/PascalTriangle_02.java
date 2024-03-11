package Arrays_MoreExercise;

import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        String [] columns = new String[rows];
        for (int i = 0; i < columns.length; i++) {
            String [] number = new String [i];
            for (int j = 0; j <= i; j++) {
                number [j] += 1;
            }
            System.out.println(number);
        }
    }
}

package NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int current = 0;
        boolean isBigger = false;
        for (int i = 1; i <= number; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++ ) {
                current++;
                System.out.printf("%d ",current);
                if (current >= number) {
                    isBigger = true;
                    break;
                }
            }
            if (isBigger) {
                break;
            }
        }
    }
}

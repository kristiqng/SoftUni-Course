package ForLoopExercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double one = 0;
        double two = 0;
        double three = 0;
        double four = 0;
        double five = 0;
        for (int i = 1 ; i <= n ; i++) {
            int digit = Integer.parseInt(scanner.nextLine());
            if (digit > 0 && digit < 200) {
                one += 1;
            } else if (digit > 199 && digit < 400) {
                two += 1;
            } else if (digit > 399 && digit < 600) {
                three += 1;
            } else if (digit > 599 && digit < 800) {
                four += 1;
            } else {
                five += 1;
            }
        }
        System.out.printf("%.2f%%%n",one / n * 100);
        System.out.printf("%.2f%%%n",two / n * 100);
        System.out.printf("%.2f%%%n",three / n * 100);
        System.out.printf("%.2f%%%n",four / n * 100);
        System.out.printf("%.2f%%%n",five / n * 100);
    }
}

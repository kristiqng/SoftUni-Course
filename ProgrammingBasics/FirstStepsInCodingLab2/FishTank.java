package FirstStepsInCodingLab2;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = Integer.parseInt(scanner.nextLine());
        int sh = Integer.parseInt(scanner.nextLine());
        int v = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double space = (d * sh * v * 1.0) / 1000;

        double all = space - (space * (percent * 0.01));
        System.out.println(all);

    }
}

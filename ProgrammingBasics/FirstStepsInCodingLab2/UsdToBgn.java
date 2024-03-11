package FirstStepsInCodingLab2;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bgn = 1.79549;
        double dollars = Double.parseDouble(scanner.nextLine());
        System.out.println(dollars * bgn);
    }
}

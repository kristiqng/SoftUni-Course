package CondiStatementLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double total = 0.000;
        if (figure.equals("square")) {
            double num = Double.parseDouble(scanner.nextLine());
            total += num * num;
        } else if (figure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            total += a * b;
        } else if (figure.equals("circle")) {
            double a = Double.parseDouble(scanner.nextLine());
            total += a * a * Math.PI;
        } else if (figure.equals("triangle")){
            double num = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            total += (num * num2) / 2;
        }
        System.out.printf("%.3f", total);

    }
}

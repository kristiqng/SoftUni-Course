package FirstStepsInCodingLab2;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pen = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double sumPen = pen * 5.80;
        double sumMarker = marker * 7.20;
        double sumLiters = liters * 1.20;
        double all = sumPen + sumLiters + sumMarker;
        double total = all - (all * (discount * 0.01));
        System.out.println(total);
    }
}

package CondiStatementLab2;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        double distanceWithTime = time * distance;
        double resist = Math.floor((distance / 15)) * 12.5;
        double total = distanceWithTime + resist;
        if (total >= record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (total - record));
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", total);
        }
    }
}

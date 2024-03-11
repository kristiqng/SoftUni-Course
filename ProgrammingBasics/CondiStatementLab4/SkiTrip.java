package CondiStatementLab4;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine();
        String grade = scanner.nextLine();
        double priceForNights = 0;
        switch (place) {
            case "room for one person":
                priceForNights = (days - 1) * 18.0;
                break;
            case "apartment":
                priceForNights = (days - 1) * 25.0;
                if (days < 10) {
                    priceForNights *= 0.70;
                } else if ( days >= 10 && days <= 15){
                    priceForNights *= 0.65;
                }  else {
                    priceForNights *= 0.50;
                }
                break;
            case "president apartment":
                priceForNights = (days - 1) * 35.0;
                if (days < 10) {
                    priceForNights *= 0.90;
                } else if ( days >= 10 && days <= 15){
                    priceForNights *= 0.85;
                }  else {
                    priceForNights *= 0.80;
                }
                break;
        }
        switch (grade) {
            case "positive":
                priceForNights *= 1.25;
                break;
            case "negative":
                priceForNights *= 0.90;
                break;
        }
        System.out.printf("%.2f", priceForNights);
    }
}

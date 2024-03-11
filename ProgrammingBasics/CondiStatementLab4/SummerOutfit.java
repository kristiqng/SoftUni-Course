package CondiStatementLab4;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        if (degrees >= 10 && degrees <= 18) {
            switch (time) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Evening":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        } else if (degrees > 18 && degrees <= 24) {
            switch (time) {
                case "Morning":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Evening":
                    outfit = "Swim suit";
                    shoes = "Barefoot";
                    break;
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        } else if (degrees >= 25) {
            switch (time) {
                case "Morning":
                case "Afternoon":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        }
    }
}

package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDog = Integer.parseInt(scanner.nextLine());
        int totalCat = Integer.parseInt(scanner.nextLine());

        double catFood = 4.0;
        double dogFood = 2.5;

        double allDog = totalDog * dogFood;
        double allCat = totalCat * catFood;

        System.out.println(allCat + allDog + " lv.");
    }
}

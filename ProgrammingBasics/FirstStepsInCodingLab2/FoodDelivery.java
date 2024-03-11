package FirstStepsInCodingLab2;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vhod
        int sumChicken = Integer.parseInt(scanner.nextLine());
        int sumFish = Integer.parseInt(scanner.nextLine());
        int sumVeg = Integer.parseInt(scanner.nextLine());
        //izchisleniq
        double all = sumChicken * 10.35 + sumFish * 12.40 + sumVeg * 8.15;
        double dessert = all * 0.20;
        double total = all + dessert + 2.50;
        //print
        System.out.println(total);
    }
}

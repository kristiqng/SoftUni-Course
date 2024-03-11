package FirstStepsInCodingLab;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double meters = Double.parseDouble(scanner.nextLine());
        double price = meters * 7.61;
        double discount = price * 0.18;
        double total = price - discount;

        System.out.printf("The final price is: %f lv.", total);
        System.out.println();
        System.out.printf("The discount is: %f lv.", discount);
    }
}

package FirstStepsInCodingLab2;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double naylonPrice = (naylon + 2) * 1.50;
        double paintPrice = (paint + (paint * 0.10))  * 14.50;
        double thinnerPrice = thinner * 5.00;
        double sumAll = naylonPrice + paintPrice + thinnerPrice + 0.40;
        double hourWork = sumAll * 0.30;
        double hoursPay = hours * hourWork;
        double total = hoursPay + sumAll;
        System.out.println(total);


    }
}

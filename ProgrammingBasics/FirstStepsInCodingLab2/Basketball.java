package FirstStepsInCodingLab2;

import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vhod
        int tax = Integer.parseInt(scanner.nextLine());
        //izchisleniq
        double shoes = tax - (tax * 0.40);
        double clothes = shoes - (shoes * 0.20);
        double ball = clothes * 0.25;
        double things = ball * 0.20;
        double total = tax + shoes + clothes + ball + things;
        //pechatene
        System.out.println(total);
    }
}

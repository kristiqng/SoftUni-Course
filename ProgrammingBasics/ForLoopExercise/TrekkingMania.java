package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int all = 0;
        double musala = 0;
        double monblan = 0;
        double kilim = 0;
        double k2 = 0;
        double everest = 0;
        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            if (people <= 5) {
                musala += people;
                all += people;
            } else if (people <= 12) {
                monblan += people;
                all += people;
            } else if (people <= 25) {
                kilim += people;
                all += people;
            } else if (people <= 40) {
                k2 += people;
                all += people;
            } else {
                everest += people;
                all += people;
            }
        }
        //Изкачващи Мусала: 6 / 326 * 100 = 1.84%
        System.out.printf("%.2f%%%n", musala / all * 100.0);
        System.out.printf("%.2f%%%n", monblan / all * 100.0);
        System.out.printf("%.2f%%%n", kilim / all * 100.0);
        System.out.printf("%.2f%%%n", k2 / all * 100.0);
        System.out.printf("%.2f%%", everest / all * 100.0);
    }
}
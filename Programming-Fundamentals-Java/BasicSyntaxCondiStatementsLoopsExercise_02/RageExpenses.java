package BasicSyntaxCondiStatementsLoopsExercise_02;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;
        int keyboardCrash = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            int both = 0;
            if (i % 2 == 0) {
                both += 1;
                headsetCount += 1;
            }
            if (i % 3 == 0) {
                both += 1;
                mouseCount += 1;
            }
            if (both == 2) {
                keyboardCount += 1;
                keyboardCrash += 1;
            }
            if (keyboardCrash == 2) {
                displayCount += 1;
                keyboardCrash -= 2;
            }
        }
        double total = (headsetCount * headsetPrice) + (mousePrice * mouseCount) + (keyboardPrice * keyboardCount)
                + (displayCount * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}

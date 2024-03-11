package BasicSyntaxCondiStatementsLoopsLab;

import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int total = min + 30;
        if (total >= 60) {
            total -= 60;
            hour += 1;
            if (hour == 24) {
                hour -= 24;
            }
        }
        System.out.printf("%d:%02d", hour, total);
    }
}

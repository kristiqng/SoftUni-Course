package CondiStatementLab2;

import java.util.Scanner;

public class TimePlus15Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minute = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int realMin = minute;
        int realSec = second;
        if (second > 45) {
            realMin += 1;
            realSec -= 45;
            if (realMin >= 24) {
                realMin -= 24;
            }
                if (realSec < 10) {
                    System.out.printf("%d:0%d", realMin, realSec);
                } else {
                    System.out.printf("%d:%d", realMin, realSec);
                }

        } else {
            realSec += 15;
            if (realSec == 60) {
                realSec -= 60;
                realMin+= 1;
                if (realMin == 24) {
                    realMin -= 24;
                    System.out.printf("%d:0%d", realMin, realSec);
                } else {
                    System.out.printf("%d:0%d", realMin, realSec);
                }
            } else {
                System.out.printf("%d:%d", realMin, realSec);
            }
        }
    }
}

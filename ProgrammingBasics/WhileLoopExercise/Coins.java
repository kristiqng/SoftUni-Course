package WhileLoopExercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int coins = (int)(money * 100);
        int counterCoins = 0;
        while (coins != 0) {
            if (coins - 200 >= 0) {
                coins = coins - 200;
                counterCoins++;
                continue;
            }
            if (coins - 100 >= 0) {
                coins = coins - 100;
                counterCoins++;
                continue;
            }
            if (coins - 50 >= 0) {
                coins = coins - 50;
                counterCoins++;
                continue;
            }
            if (coins - 20 >= 0) {
                coins = coins - 20;
                counterCoins++;
                continue;
            }
            if (coins - 10 >= 0) {
                coins = coins - 10;
                counterCoins++;
                continue;
            }
            if (coins - 5 >= 0) {
                coins = coins - 5;
                counterCoins++;
                continue;
            }
            if (coins - 2 >= 0) {
                coins = coins - 2;
                counterCoins++;
                continue;
            }
            if (coins - 1 == 0) {
                coins = 0;
                counterCoins++;
                continue;
            }

        }
        System.out.println(counterCoins);
    }
}

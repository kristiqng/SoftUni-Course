package TextProcessing_Exercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        char[] firstWord = input[0].toCharArray();
        char[] secondWord = input[1].toCharArray();
        int sum = 0;
        int big = Math.max(firstWord.length, secondWord.length);
        int small = Math.min(firstWord.length, secondWord.length);
        for (int i = 0; i < small; i++) {
            sum += (int) firstWord[i] * (int) secondWord[i];
        }
        if (firstWord.length < secondWord.length) {
            int diff = big - small;
            for (int i = 0; i < diff; i++) {
                sum += secondWord[big - 1];
                big--;
            }
        } else if (firstWord.length > secondWord.length) {
            int diff = big - small;
            for (int i = 0; i < diff; i++) {
                sum += firstWord[big - 1];
                big--;
            }
        }
        System.out.println(sum);
    }
}

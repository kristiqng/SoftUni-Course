package TextProcessing_Exercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder word = new StringBuilder(scanner.nextLine());
        int totalPoints = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentSymbol = word.charAt(i);
            if (currentSymbol == '>') {
                totalPoints += Integer.parseInt(String.valueOf(word.charAt(i + 1)));
                }
            if (currentSymbol != '>' && totalPoints > 0) {
                word.deleteCharAt(i);
                totalPoints--;
                i--;
            }
        }
        System.out.println(word);
    }
}

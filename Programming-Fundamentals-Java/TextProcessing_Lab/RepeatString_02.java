package TextProcessing_Lab;

import java.util.Scanner;

public class RepeatString_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        StringBuilder wordsSeq = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                wordsSeq.append(word);
            }
        }
        System.out.println(wordsSeq);
    }
}

package TextProcessing_Lab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] forbiddenWords = scanner.nextLine().split(", ");
        String sentence = scanner.nextLine();
        for (String forbiddenWord : forbiddenWords) {
            String stars = "";
            for (int i = 0; i < forbiddenWord.length(); i++) {
                stars += "*";
            }
            while (sentence.contains(forbiddenWord)) {
                sentence = sentence.replace(forbiddenWord, stars);
            }
        }
        System.out.println(sentence);
    }
}

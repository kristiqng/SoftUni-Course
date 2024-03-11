package TextProcessing_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            words.add(input);
            input = scanner.nextLine();
        }
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0 ; i--) {
                reverseWord.append(word.charAt(i));
            }
            System.out.printf("%s = %s%n", word, reverseWord);
        }
    }
}

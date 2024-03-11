package TextProcessing_Lab;

import java.util.Scanner;

public class Substring_03_second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String deleteWord = scanner.nextLine();
        String word = scanner.nextLine();

        int index = word.indexOf(deleteWord);

        while (index != -1) {
            word = word.substring(0, index) + word.substring(index + deleteWord.length());
            index = word.indexOf(deleteWord);
        }

        // Output the modified word
        System.out.println(word);
    }
}
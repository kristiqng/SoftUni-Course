package TextProcessing_Lab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String deleteWord = scanner.nextLine();
        String word = scanner.nextLine();
        while(word.contains(deleteWord)) {
            word = word.replace(deleteWord, "");
        }
        System.out.println(word);
    }
}

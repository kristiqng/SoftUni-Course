package TextProcessing_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] word = input.toCharArray();
        StringBuilder finalWord = new StringBuilder();
        String lastChar = "";
        for (char ch : word) {
            String currentChar = String.valueOf(ch);
            if (!currentChar.equals(lastChar)) {
                finalWord.append(ch);
                lastChar = currentChar;
            }
        }
        System.out.println(finalWord);
    }
}

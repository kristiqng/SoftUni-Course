package TextProcessing_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputToChar = input.toCharArray();
        StringBuilder encryptedWords = new StringBuilder();
        for (char ch : inputToChar) {
            encryptedWords.append((char) (ch + 3));
        }
        System.out.println(encryptedWords);
    }
}

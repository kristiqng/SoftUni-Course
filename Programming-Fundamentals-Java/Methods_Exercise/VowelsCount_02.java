package Methods_Exercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        vowelsCount(text);
    }
    public static void vowelsCount(String text) {
        int vowels = 0;
        for (char letter : text.toCharArray()
             ) {
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
            }
        }
        System.out.println(vowels);
    }
}

package ObjectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        int num = text.length;
        Random rnd = new Random();
        for (int i = 0; i < text.length; i++) {
            int randomNumber = rnd.nextInt(num);
            String first = text[i];
            String second = text[randomNumber];
            text[randomNumber] = first;
            text[i] = second;
        }
        for (String word : text
             ) {
            System.out.println(word);
        }
    }
}

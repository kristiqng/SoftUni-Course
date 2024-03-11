package ForLoopLab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int number = 0;
        for (int i = 0; i < text.length(); i ++) {
            String letter = text.charAt(i) + "";
            switch (letter) {
                case "a":
                    number += 1;
                    break;
                case "e":
                    number += 2;
                    break;
                case "i":
                    number += 3;
                    break;
                case "o":
                    number += 4;
                    break;
                case "u":
                    number += 5;
                    break;
            }
        }
        System.out.println(number);
    }
}

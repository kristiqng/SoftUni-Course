package BasicSyntaxCondiStatementsLoopsExercise_MoreEx;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = Integer.parseInt(scanner.nextLine());
        String text = "";
        for (int i = 1; i <= tries; i++) {
            int buttonClicks = Integer.parseInt(scanner.nextLine()); ///222 a b c
            String buttonLenght = buttonClicks + ""; // text "222"
            int digitsInButtonClicks = buttonLenght.length(); // int = 3;
            int mainDigit = buttonClicks % 10; // 2
            switch (mainDigit) {
                case 2:
                    if (digitsInButtonClicks == 1) {
                        text += "a";
                    } else if (digitsInButtonClicks == 2) {
                        text += "b";
                    } else if (digitsInButtonClicks == 3) {
                        text += "c";
                    }
                    break;
                case 3:
                    if (digitsInButtonClicks == 1) {
                        text += "d";
                    } else if (digitsInButtonClicks == 2) {
                        text += "e";
                    } else if (digitsInButtonClicks == 3) {
                        text += "f";
                    }
                    break;
                case 4:
                    if (digitsInButtonClicks == 1) {
                        text += "g";
                    } else if (digitsInButtonClicks == 2) {
                        text += "h";
                    } else if (digitsInButtonClicks == 3) {
                        text += "i";
                    }
                    break;
                case 5:
                    if (digitsInButtonClicks == 1) {
                        text += "j";
                    } else if (digitsInButtonClicks == 2) {
                        text += "k";
                    } else if (digitsInButtonClicks == 3) {
                        text += "l";
                    }
                    break;
                case 6:
                    if (digitsInButtonClicks == 1) {
                        text += "m";
                    } else if (digitsInButtonClicks == 2) {
                        text += "n";
                    } else if (digitsInButtonClicks == 3) {
                        text += "o";
                    }
                    break;
                case 7:
                    if (digitsInButtonClicks == 1) {
                        text += "p";
                    } else if (digitsInButtonClicks == 2) {
                        text += "q";
                    } else if (digitsInButtonClicks == 3) {
                        text += "r";
                    } else if (digitsInButtonClicks == 4) {
                        text += "s";
                    }
                    break;
                case 8:
                    if (digitsInButtonClicks == 1) {
                        text += "t";
                    } else if (digitsInButtonClicks == 2) {
                        text += "u";
                    } else if (digitsInButtonClicks == 3) {
                        text += "v";
                    }
                    break;
                case 9:
                    if (digitsInButtonClicks == 1) {
                        text += "w";
                    } else if (digitsInButtonClicks == 2) {
                        text += "x";
                    } else if (digitsInButtonClicks == 3) {
                        text += "y";
                    } else if (digitsInButtonClicks == 4) {
                        text += "z";
                    }
                    break;
                case 0:
                    text += " ";
                    break;
            }
        }
        System.out.println(text);
    }
}

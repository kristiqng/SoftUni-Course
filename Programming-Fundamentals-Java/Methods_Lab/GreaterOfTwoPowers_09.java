package Methods_Lab;

import java.util.Scanner;

public class GreaterOfTwoPowers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(a,b));
                break;
            case "char":
                char firstLetter = scanner.nextLine().charAt(0);
                char secondLetter = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstLetter,secondLetter));
                break;
            case "string":
                String firstWord = scanner.nextLine();
                String secondWord = scanner.nextLine();
                System.out.println(getMax(firstWord, secondWord));
                break;
        }
    }
    public static int getMax (int a, int b) {
        return Math.max(a, b);
    }
    public static char getMax (char firstLetter, char secondLetter) {
       return (char)Math.max(firstLetter, secondLetter);
    }
    public static String getMax (String firstWord, String secondWord) {
        if (firstWord.compareTo(secondWord) >= 0) {
            return firstWord;
        } else {
            return secondWord;
        }
    }
}

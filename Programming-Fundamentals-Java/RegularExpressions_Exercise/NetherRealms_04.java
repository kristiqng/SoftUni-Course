package RegularExpressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().replaceAll("\\s+", "").split(",");
        for (int i = 0; i < input.length; i++) {
            String demon = input[i];
            int demonHealth = getDemonHealth(demon);
            double damage = getDemonDamage(demon);
            System.out.printf("%s - %d health, %.2f damage%n", demon, demonHealth, damage);
        }
    }

    private static double getDemonDamage(String demon) {
        Pattern pattern = Pattern.compile("\\-?[0-9]+[\\.]?[0-9]*");
        Matcher matcher = pattern.matcher(demon);
        double sumNumbers = 0;
        while (matcher.find()) {
            sumNumbers += Double.parseDouble(matcher.group());
        }
        for (int i = 0; i < demon.length(); i++) {
            char c = demon.charAt(i);
            if (c == '*') {
                sumNumbers *= 2;
            }
            if (c == '/') {
                sumNumbers /= 2;
            }
        }
        return sumNumbers;
    }

    private static int getDemonHealth(String demon) {
        Pattern pattern = Pattern.compile("[^\\d+\\+\\-\\*\\/\\.]");
        Matcher matcher = pattern.matcher(demon);
        int health = 0;
        while (matcher.find()) {
            char currentChar = matcher.group().charAt(0);
            health += currentChar;
        }
        return health;
    }
}

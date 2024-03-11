package RegularExpressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String text = scanner.nextLine();
            Pattern pattern = Pattern.compile("\\b[\\_][\\.]+[A-Z][A-Z-a-z0-9]{4,}[A-Z][\\_][\\.]+");
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String group = findGroup(text);
                if (group.length() == 0) {
                    System.out.println("Group: default");
                    continue;
                }
                System.out.println("Group: " + group);
            } else {
                System.out.println("Invalid pass!");
            }
        }
    }

    private static String findGroup(String text) {
        Pattern patter = Pattern.compile("[0-9]");
        Matcher matcher = patter.matcher(text);
        StringBuilder group = new StringBuilder();
        while (matcher.find()) {
            group.append(String.valueOf(matcher.group().charAt(0)));
        }
        return String.valueOf(group);
    }
}

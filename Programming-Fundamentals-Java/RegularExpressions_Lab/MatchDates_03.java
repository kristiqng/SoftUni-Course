package RegularExpressions_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "\\b(?<day>[\\d]{2})([\\.|\\-|\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>[\\d]{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.printf("Day: %s, Month: %s, Year: %s%n", matcher.group("day"), matcher.group("month"),
                    matcher.group("year"));

        }
    }
}

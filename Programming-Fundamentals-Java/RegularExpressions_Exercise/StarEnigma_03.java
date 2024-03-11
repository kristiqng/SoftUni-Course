package RegularExpressions_Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            int decrease = countLetters(text);
            StringBuilder modifiedText = new StringBuilder();
            for (int j = 0; j < text.length(); j++) {
                char current = text.charAt(j);
                modifiedText.append((char)(current - decrease));
            }
            Pattern pattern = Pattern.compile("@(?<planetName>[A-Za-z]+)[^\\@\\,\\-\\!\\:\\>]*" +
                    ":(?<population>[0-9]+)[^\\@\\,\\-\\!\\:\\>]*!(?<type>[AD])![^\\@\\,\\-\\!\\:\\>]*->(?<soldiers>[0-9]+)");
            Matcher matcher = pattern.matcher(modifiedText);
            if (matcher.find()) {
                String name = matcher.group("planetName");
                String type = matcher.group("type");
                if (type.equals("A")) {
                    attackedPlanets.add(name);
                } else {
                    destroyedPlanets.add(name);
                }
            }
        }
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);
        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        for (String planet : attackedPlanets) {
            System.out.printf("-> %s%n", planet);
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        for (String planet : destroyedPlanets) {
            System.out.printf("-> %s%n", planet);
        }
    }
    public static int countLetters(String text) {
        String regex = "[STRAstra]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int number = 0;
        while (matcher.find()) {
            number += 1;
        }
        return number;
    }
}

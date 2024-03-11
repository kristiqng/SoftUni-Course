package AssociativeArraysLambdaStreamAPExercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        LinkedHashMap<Character, Integer> letters = new LinkedHashMap<>();
        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!letters.containsKey(symbol)) {
                letters.put(symbol, 1);
            } else {
                letters.put(symbol, letters.get(symbol) + 1);
            }
        }
        letters.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}

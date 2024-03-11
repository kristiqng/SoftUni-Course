package AssociativeArraysLambdaStreamAPLab;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String[] lowerCaseWords = Arrays.stream(words)
                .map(String::toLowerCase)
                .toArray(String[]::new);
        LinkedHashMap<String, Integer> countWords = new LinkedHashMap<>();
        for (String word : lowerCaseWords) {
            if (!countWords.containsKey(word)) {
                countWords.put(word, 1);
            } else {
                countWords.put(word, countWords.get(word) + 1);
            }
        }
        List <String> finalWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            int sum = entry.getValue();
            if (sum % 2 != 0) {
                finalWords.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", finalWords));
    }
}


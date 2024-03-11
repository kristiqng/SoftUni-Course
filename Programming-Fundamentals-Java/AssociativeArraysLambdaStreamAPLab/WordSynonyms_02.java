package AssociativeArraysLambdaStreamAPLab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> wordsWithSynonyms = new LinkedHashMap<>();
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();
            if (!wordsWithSynonyms.containsKey(key)) {
                wordsWithSynonyms.put(key, new ArrayList<>());
                wordsWithSynonyms.get(key).add(value);
            } else {
                wordsWithSynonyms.get(key).add(value);
            }
        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsWithSynonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }
    }
}

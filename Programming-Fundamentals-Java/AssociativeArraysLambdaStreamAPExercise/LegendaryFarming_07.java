package AssociativeArraysLambdaStreamAPExercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap <String, Integer> junks = new LinkedHashMap<>();
        junks.put("shards", 0);
        junks.put("fragments", 0);
        junks.put("motes", 0);
        boolean isFound = false;
        while (!isFound) {
            String[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(String::toLowerCase)
                    .toArray(String[]::new);
            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String item = input[i + 1];
                if (!junks.containsKey(item)) {
                    junks.put(item, quantity);
                } else {
                    junks.put(item, junks.get(item) + quantity);
                }
                if (!isFound) {
                    if (junks.get("shards") >= 250) {
                        junks.put("shards", junks.get("shards") - 250);
                        System.out.println("Shadowmourne obtained!");
                        isFound = true;
                        break;
                    }
                    if (junks.get("fragments") >= 250) {
                        junks.put("fragments", junks.get("fragments") - 250);
                        System.out.println("Valanyr obtained!");
                        isFound = true;
                        break;
                    }
                    if (junks.get("motes") >= 250) {
                        junks.put("motes", junks.get("motes") - 250);
                        System.out.println("Dragonwrath obtained!");
                        isFound = true;
                        break;
                    }
                }
            }
        }
        junks.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

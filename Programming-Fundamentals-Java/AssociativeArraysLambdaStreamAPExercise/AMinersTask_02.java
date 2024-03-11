package AssociativeArraysLambdaStreamAPExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinersTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();
        LinkedHashMap<String, Integer> total = new LinkedHashMap<>();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!total.containsKey(resource)) {
                total.put(resource, quantity);
            } else {
                total.put(resource, total.get(resource) + quantity);
            }
            resource = scanner.nextLine();
        }
        total.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

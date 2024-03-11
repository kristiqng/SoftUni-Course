package AssociativeArraysLambdaStreamAPExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
        LinkedHashMap<String, ArrayList<Double>> totalProducts = new LinkedHashMap<>();
            while (!input.equals("buy")) {
                String product = input.split("\\s+")[0];
                double price = Double.parseDouble(input.split("\\s+")[1]);
                double quantity = Double.parseDouble(input.split("\\s+")[2]);
                if (!totalProducts.containsKey(product)) {
                    totalProducts.put(product, new ArrayList<>());
                    totalProducts.get(product).add(price);
                    totalProducts.get(product).add(quantity);
                } else {
                    ArrayList<Double> diff = totalProducts.get(product);
                    diff.set(0, price);
                    diff.set(1, diff.get(1) + quantity);
                }
                input = scanner.nextLine();
            }
        for (Map.Entry<String, ArrayList<Double>> entry : totalProducts.entrySet()) {
            double sum = 1;
            for (Double number : entry.getValue()) {
                sum *= number;
            }
            System.out.printf("%s - > %.2f%n", entry.getKey(), sum);
        }
    }
}

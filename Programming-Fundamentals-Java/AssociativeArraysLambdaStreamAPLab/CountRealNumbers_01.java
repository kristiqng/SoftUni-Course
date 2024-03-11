package AssociativeArraysLambdaStreamAPLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        TreeMap<Double, Integer> numbersCount = new TreeMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (!numbersCount.containsKey(numbers[i])) {
                numbersCount.put(numbers[i], 1);
            } else {
                numbersCount.put(numbers[i], numbersCount.get(numbers[i]) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbersCount.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#####");
            System.out.printf("%s -> %s%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}

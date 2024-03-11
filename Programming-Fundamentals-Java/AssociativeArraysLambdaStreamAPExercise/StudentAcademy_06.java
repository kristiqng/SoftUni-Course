package AssociativeArraysLambdaStreamAPExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<Double>> student = new LinkedHashMap<>();
        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!student.containsKey(name)) {
                student.put(name, new ArrayList<>());
                student.get(name).add(grade);
            } else {
                student.get(name).add(grade);
            }
        }
        LinkedHashMap<String, Double> finalNumbers = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Double>> entry : student.entrySet()) {
            int num = entry.getValue().size();
            double sum = 0;
            for (double d : entry.getValue()) {
                sum += d;
            }
            double total = sum / num;
            if (total >= 4.50) {
                finalNumbers.put(entry.getKey(), total);
            }
        }
        finalNumbers.forEach((key, value) -> System.out.println(key + " -> " + String.format("%.2f", value)));
    }
}

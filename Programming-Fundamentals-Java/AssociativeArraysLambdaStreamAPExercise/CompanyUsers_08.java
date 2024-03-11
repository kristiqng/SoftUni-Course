package AssociativeArraysLambdaStreamAPExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> all = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String[] text = input.split(" -> ");
            String company = text[0];
            String employee = text[1];
            if (!all.containsKey(company)) {
                all.put(company,new ArrayList<>());
                all.get(company).add(employee);
            } else {
                if (!all.get(company).contains(employee)) {
                    all.get(company).add(employee);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : all.entrySet()) {
            System.out.println(entry.getKey());
            for (String emp : entry.getValue()) {
                System.out.println("-- " + emp);
            }
        }
    }
}

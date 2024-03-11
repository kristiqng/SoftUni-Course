package AssociativeArraysLambdaStreamAPExercise;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> courseNames = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String program = input.split(" : ")[0];
            String name = input.split(" : ")[1];
            if (!courseNames.containsKey(program)) {
                courseNames.put(program, new ArrayList<>());
                courseNames.get(program).add(name);
            } else {
                courseNames.get(program).add(name);
            }
            input = scanner.nextLine();
        }
        courseNames.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(name -> System.out.println("-- " + name));
                });
    }
}

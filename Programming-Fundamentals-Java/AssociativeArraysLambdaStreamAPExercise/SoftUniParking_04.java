package AssociativeArraysLambdaStreamAPExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> parking = new LinkedHashMap<>();
        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String name = input[1];
            if (command.equals("register")) {
                String plate = input[2];
                if (!parking.containsKey(name)) {
                    parking.put(name, plate);
                    System.out.printf("%s registered %s successfully%n", name, plate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", parking.get(name));
                }
            }
            if (command.equals("unregister")) {
                if (parking.containsKey(name)) {
                    parking.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }
            }
        }
        parking.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}

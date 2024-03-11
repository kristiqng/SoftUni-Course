package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
            String input = scanner.nextLine();
            while (!input.equals("Craft!")) {
                String[] inputArray = input.split(" - ");
                String command = inputArray[0];
                switch (command) {
                    case "Collect":
                        String item = inputArray[1];
                        if (!items.contains(item)) {
                            items.add(item);
                        }
                        break;
                    case "Drop":
                        if (items.contains(inputArray[1])) {
                            items.remove(inputArray[1]);
                        }
                        break;
                    case "Combine Items":
                        String[] itemsToCombine = inputArray[1].split(":");
                        if (items.contains(itemsToCombine[0])) {
                            items.add(items.indexOf(itemsToCombine[0]) + 1, itemsToCombine[1]);
                        }
                        break;
                    case "Renew":
                        if (items.contains(inputArray[1])) {
                            items.remove(inputArray[1]);
                            items.add(inputArray[1]);
                        }
                }
                input = scanner.nextLine();
            }
        System.out.println(String.join(", ", items));
    }
}

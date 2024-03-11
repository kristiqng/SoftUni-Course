package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            String item = inputArray[1];
            switch (command) {
                case "Urgent":
                    if (!items.contains(item)) {
                        items.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (items.contains(item)) {
                        items.remove(item);
                    }
                    break;
                case "Correct" :
                    String newItem = inputArray[2];
                    if (items.contains(item)) {
                        items.set(items.indexOf(item), newItem);
                    }
                    break;
                case "Rearrange" :
                    if (items.contains(item)) {
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", items));
    }
}

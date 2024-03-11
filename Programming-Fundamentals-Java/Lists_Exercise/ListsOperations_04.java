package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListsOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.contains("Add")) {
                numbers.add(Integer.parseInt(input.split(" ")[1]));
            } else if (input.contains("Remove")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                if (index >= 0 && index <= numbers.size()) {
                    numbers.remove(Integer.parseInt(input.split(" ")[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (input.contains("Insert")) {
                int index = Integer.parseInt(input.split(" ")[2]);
                if (index >= 0 && index <= numbers.size()) {
                    numbers.add(Integer.parseInt(input.split(" ")[2]), Integer.parseInt(input.split(" ")[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (input.contains("Shift left")) {
                int count = Integer.parseInt(input.split(" ")[2]);
                for (int i = 0 ; i < count ; i++) {
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);
                }
            } else if (input.contains("Shift right")) {
                int count = Integer.parseInt(input.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNumber);
                }
            }
            input = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

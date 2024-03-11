package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            int index = Integer.parseInt(inputArray[1]);
            int points = Integer.parseInt(inputArray[2]);
            switch (command) {
                case "Shoot":
                    if (index >= 0 && index < numbers.size()) {
                        numbers.set(index, numbers.get(index) - points);
                        if (numbers.get(index) <= 0) {
                            numbers.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, points);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (index - points < 0 || index + points > numbers.size()) {
                        System.out.println("Strike missed!");
                    } else {
                        for (int i = 1; i <= points; i++) {
                            numbers.remove(index - 1);
                            index--;
                        }
                        for (int i = 1; i <= points; i++) {
                            numbers.remove(index + 1);
                        }
                        numbers.remove(index);
                    }
                    break;
            }
            input = scanner.nextLine();
            }
        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.print(numbers.get(i) + "|");
        }
        System.out.print(numbers.get(numbers.size()-1));
        }
}

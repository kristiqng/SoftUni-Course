package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] arrayInput = input.split(" ");
            switch (arrayInput[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(arrayInput[1]));

                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(arrayInput[1]));

                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(arrayInput[1]));

                    break;
                case "Insert":
                    numbers.set(Integer.parseInt(arrayInput[2]), Integer.parseInt(arrayInput[1]));

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numbers);
    }
}

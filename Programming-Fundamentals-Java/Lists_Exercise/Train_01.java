package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.contains("Add")) {
                numbers.add(Integer.parseInt(input.split(" ")[1]));
            }
            else {
                int index = 0;
                for ( int wagon : numbers) {
                    if (wagon + Integer.parseInt(input) <= capacity) {
                        numbers.set(index, Integer.parseInt(input) + wagon);
                        break;
                    }
                    index++;
                }
            }
            input = scanner.nextLine();
        }
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}

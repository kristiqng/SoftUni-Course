package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")){
           String[] inputArray = input.split(" ");
            if (input.contains("Delete")) {
                numbers.removeAll(Arrays.asList(Integer.parseInt(inputArray[1])));
            }
            if (input.contains("Insert")) {
                numbers.add(Integer.parseInt(inputArray[2]), Integer.parseInt(inputArray[1]));
            }
            input = scanner.nextLine();
        }
        for (int element : numbers
             ) {
            System.out.print(element + " ");
        }
    }
}

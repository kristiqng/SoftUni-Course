package Lists_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numbers.removeIf(element -> element < 0);
        if (numbers.size() > 0) {
            Collections.reverse(numbers);
            for (int element : numbers
            ) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("empty");
        }
    }
}

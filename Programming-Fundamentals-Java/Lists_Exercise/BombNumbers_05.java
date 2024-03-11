package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] bombNumbers = scanner.nextLine().split(" ");
        int specialNumber = Integer.parseInt(bombNumbers[0]);
        int power = Integer.parseInt(bombNumbers[1]);
        int size = numbers.size();
        for (int index = 0 ; index < numbers.size() ; index++) {
                                                                   //1 7 7 1 2 3
            if (numbers.get(index) == specialNumber) {
                for (int i = 1; i <= power; i++) {
                    if (index - 1 >= 0 && index - 1 < numbers.size() && numbers.get(index-1) != specialNumber) {
                        numbers.remove(index - 1);
                        index--;
                    }
                }
                for (int j = 1; j <= power; j++) {
                    if (index + 1 < numbers.size()) {
                        numbers.remove(index + 1);
                    } else {
                        break;
                    }
                }
            }
            if (index == numbers.size() - 1) {
                break;
            }

        }
        numbers.removeAll(Arrays.asList(Integer.parseInt(bombNumbers[0])));
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        System.out.println(sum);
    }
}

package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();
        //23 -2 321 87 42 90 -123
        while (!input.equals("end")) {
            if (input.contains("swap")) {
                String[] swapper = input.split(" ");
                int numberOne = Integer.parseInt(swapper[1]);//1
                int numberTwo = Integer.parseInt(swapper[2]);//3
                int first = numbers[numberOne];
                int second = numbers[numberTwo];
                numbers[numberOne] = second;
                numbers [numberTwo] = first;
                input = scanner.nextLine();
            } else if (input.contains("multiply")) {
                String[] swapper = input.split(" ");
                int numberOne = Integer.parseInt(swapper[1]);//1
                int numberTwo = Integer.parseInt(swapper[2]);//3
                int first = numbers[numberOne];
                int second = numbers[numberTwo];
                numbers[numberOne] = first * second;
                input = scanner.nextLine();
            } else if (input.equals("decrease")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] -= 1;
                }
                input = scanner.nextLine();
            }
        }
        System.out.println(Arrays.toString(numbers)
                .replace("[", "")
                .replace("]", ""));
    }
}

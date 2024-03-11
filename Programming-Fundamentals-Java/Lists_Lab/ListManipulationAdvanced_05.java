package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] arrayInput = input.split(" ");
            switch (arrayInput[0]) {
                case "Contains":
                    boolean isFound = false;
                    for (int element : numbers
                    ) {
                        if (element == Integer.parseInt(arrayInput[1])) {
                            isFound = true;
                        }
                    }
                    if (isFound) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = "";
                    switch (arrayInput[1]) {
                        case "even":
                            for (int element : numbers
                            ) {
                                if (element % 2 == 0) {
                                    evenOrOdd += element + " ";
                                }
                            }
                            break;
                        case "odd":
                            for (int element : numbers
                            ) {
                                if (element % 2 != 0) {
                                    evenOrOdd += element + " ";
                                }
                            }
                            break;
                    }
                    System.out.println(evenOrOdd);
                    break;
                case "Get":
                    int sum = 0;
                    if (arrayInput[1].equals("sum")) {
                        for (int element : numbers
                        ) {
                            sum += element;
                        }
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String filterNumbers = "";
                    switch (arrayInput[1]) {
                        case "<":
                            for (int element : numbers
                            ) {
                                if (element < Integer.parseInt(arrayInput[2])) {
                                    filterNumbers += element + " ";
                                }
                            }
                            break;
                        case ">":
                            for (int element : numbers
                            ) {
                                if (element > Integer.parseInt(arrayInput[2])) {
                                    filterNumbers += element + " ";
                                }
                            }
                            break;
                        case "<=":
                            for (int element : numbers
                            ) {
                                if (element <= Integer.parseInt(arrayInput[2])) {
                                    filterNumbers += element + " ";
                                }
                            }
                            break;
                        case ">=":
                            for (int element : numbers
                            ) {
                                if (element >= Integer.parseInt(arrayInput[2])) {
                                    filterNumbers += element + " ";
                                }
                            }
                            break;

                    }
                    System.out.println(filterNumbers);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}

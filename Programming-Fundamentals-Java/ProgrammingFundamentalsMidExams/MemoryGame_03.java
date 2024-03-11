package ProgrammingFundamentalsMidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        boolean isWon = false;
        int steps = 0;
        while (!input.equals("end")) {
            if (isWon) {
                input = scanner.nextLine();
                continue;
            }
            steps++;
            int firstIndex = Integer.parseInt(input.split(" ")[0]);
            int secondIndex = Integer.parseInt(input.split(" ")[1]);

            if (firstIndex == secondIndex || firstIndex < 0 || firstIndex >= elements.size()
            || secondIndex < 0 || secondIndex >= elements.size()) {
                int middle = elements.size() / 2;
                System.out.println("Invalid input! Adding additional elements to the board");
                elements.add(middle, String.format("-%da", steps));
                elements.add(middle + 1, String.format("-%da", steps));
            } else {
                if (elements.get(firstIndex).equals(elements.get(secondIndex))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(firstIndex));
                    int firstIndexToDestroy = Math.min(firstIndex, secondIndex);
                    int secondIndexToDestroy = Math.max(firstIndex,secondIndex);
                        elements.remove(secondIndexToDestroy);
                        elements.remove(firstIndexToDestroy);


                } else {
                    System.out.println("Try again!");
                }
            }
            if (elements.size() == 0) {
                    System.out.printf("You have won in %d turns!%n", steps);
                    isWon = true;
            }
            input = scanner.nextLine();
        }
        if (!isWon) {
            System.out.print("Sorry you lose :(");
            System.out.println();
            for (String ele : elements
            ) {
                System.out.print(ele + " ");
            }
        }
    }
}

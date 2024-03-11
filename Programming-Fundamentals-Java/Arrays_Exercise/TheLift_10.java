package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int [] state = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isFull = true;
        for (int i = 0; i < state.length; i++) {
            int availableSpots = 4 - state[i];
            if (availableSpots > 0) {
                if (availableSpots > people) {
                    state[i] += people;
                    people = 0;
                    isFull = false;
                } else {
                    state[i] = 4;
                    people -= availableSpots;
                }
            }
        }
        if (!isFull) {
            System.out.println("The lift has empty spots!");
        } else if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }
        for (int states : state
             ) {
            System.out.print(states + " ");
        }
    }
}

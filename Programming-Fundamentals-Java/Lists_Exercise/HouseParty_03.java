package Lists_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            String[] arrayInput = input.split(" ");
            if (input.contains("not")) {
                if (guests.contains(arrayInput[0])) {
                    guests.remove(arrayInput[0]);
                } else {
                    System.out.println(arrayInput[0] + " is not in the list!");
                }
            } else {
                if (guests.contains(arrayInput[0])) {
                    System.out.println( arrayInput[0] + " is already in the list!");
                } else {
                    guests.add(arrayInput[0]);
                }
            }
        }
        for (String name : guests) {
            System.out.println(name);
        }
    }
}

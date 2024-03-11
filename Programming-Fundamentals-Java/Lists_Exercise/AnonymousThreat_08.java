package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                String newInput = "";
                for (int i = startIndex ; i <= endIndex; i++) {
                    newInput += input.get(i);
                }
                input.set(startIndex, newInput);
                int count = endIndex - startIndex + 1;
                for (int i = 0 ; i <= count; i++) {
                    if (i > input.size()) {
                        break;
                    }
                    input.remove(startIndex + 1);
                }
            } else if (command.contains("divide")) {

            }
            command = scanner.nextLine();
        }
    }
}

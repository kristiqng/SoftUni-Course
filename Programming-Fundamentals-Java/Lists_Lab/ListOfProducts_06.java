package Lists_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            input.add(scanner.nextLine());
        }
        Collections.sort(input);
        int counting = 1;
        for (String element : input
             ) {
            System.out.print(counting + "." + element);
            counting++;
            System.out.println();
        }
    }

}

package Arrays_Lab;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] index = scanner.nextLine().split(" ");
        for (int i = 0; i < index.length / 2; i++) {
            String oldIndex = index[i];
            index[i] = index[index.length - 1 - i];
            index [index.length - 1 - i] = oldIndex;

        }
        System.out.println(String.join(" ", index));
    }
}

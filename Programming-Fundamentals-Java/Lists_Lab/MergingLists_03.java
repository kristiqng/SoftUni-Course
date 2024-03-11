package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        List<String> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int size1 = firstNumbers.size();
        int size2 = secondNumbers.size();
        boolean secondNumberIsBigger = false;
        boolean firstNumberIsBigger = false;
        if (size1 < size2) {
            secondNumberIsBigger = true;
            for (int i = 0; i < size1 * 2; i += 2) {
                secondNumbers.add(i , firstNumbers.get(0));
                firstNumbers.remove(0);
            }
        }
        if (size1 >= size2) {
            firstNumberIsBigger = true;
            for (int i = 1; i < size2 * 2; i += 2) {
                firstNumbers.add(i , secondNumbers.get(0));
                secondNumbers.remove(0);
            }
        }
        if (firstNumberIsBigger) {
            for (String number : firstNumbers
            ) {
                System.out.print(number + " ");
            }
        }  else {
            for (String number : secondNumbers
            ) {
                System.out.print(number + " ");
            }
        }
    }
}

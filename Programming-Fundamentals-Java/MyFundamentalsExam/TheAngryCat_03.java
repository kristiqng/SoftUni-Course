import java.util.Arrays;
import java.util.Scanner;

public class TheAngryCat_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] items = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int searchingIndex = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        String position = "";
        int current = items[searchingIndex];

        switch (command) {
            case "cheap":
                int leftMinNumber = Integer.MIN_VALUE;
                int rightMinNumber = Integer.MIN_VALUE;
                for (int i = searchingIndex - 1; i >= 0; i--) {
                    if (items[i] < current && items[i] > leftMinNumber) {
                        leftMinNumber = items[i];
                    }
                }
                for (int i = searchingIndex + 1; i < items.length; i++) {
                    if (items[i] < current && items[i] > rightMinNumber) {
                        rightMinNumber = items[i];
                    }
                }
                if (leftMinNumber >= rightMinNumber) {
                    position = "Left";
                    System.out.printf("%s - %d", position, leftMinNumber);
                } else {
                    position = "Right";
                    System.out.printf("%s - %d", position, rightMinNumber);
                }
                break;
            case "expensive":
                int leftSum = 0;
                int rightSum = 0;
                for (int i = searchingIndex - 1; i >= 0; i--) {
                    if (items[i] >= current) {
                        leftSum += items[i];
                    }
                }
                for (int i = searchingIndex + 1; i < items.length; i++) {
                    if (items[i] >= current) {
                        rightSum += items[i];
                    }
                }
                if (leftSum >= rightSum) {
                    position = "Left";
                    System.out.printf("%s - %d", position, leftSum);
                } else {
                    position = "Right";
                    System.out.printf("%s - %d", position, rightSum);
                }
                break;
        }
    }
}
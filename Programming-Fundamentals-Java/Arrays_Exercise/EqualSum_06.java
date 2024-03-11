package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();//1 2 3 4 5
                 //0 1 2 3 4
            for (int i = 0; i <= numbers.length - 1; i++) {
                int leftSum = 0;
                int rightSum = 0;
                for (int j = 0; j < i; j++) {
                    leftSum += numbers[j];
                }
                for (int k = i + 1; k <= numbers.length - 1; k++) {
                    rightSum += numbers[k];
                }
                if (leftSum == rightSum) {
                    System.out.print(i);
                    return;
                }
            }
        System.out.println("no");
        }
    }

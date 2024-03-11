package Lists_Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> number = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < number.size() - 1; i++) {
            double num1 = number.get(i);
            double num2 = number.get(i + 1);
            if (num1 == num2) {
                number.set(i, number.get(i) + number.get(i + 1));
                number.remove(i + 1);
                i = -1;
            }
        }
        for (double digit : number
             ) {
            System.out.print(new DecimalFormat("0.###").format(digit) + " ");
        }
    }
}

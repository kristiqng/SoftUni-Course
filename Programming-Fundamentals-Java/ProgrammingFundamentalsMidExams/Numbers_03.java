package ProgrammingFundamentalsMidExams;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<String> averageNumbers = new ArrayList<>();
        double sum = 0;
        for (int element : numbers
        ) {
            sum += element;
        }
        double average = sum / numbers.size();
        boolean isEnough = false;
        while (numbers.size() > 1 && !isEnough) {
            for (int element : numbers
            ) {
                if (element > average) {
                    averageNumbers.add(String.valueOf(element));
                }
            }
            isEnough = true;
        }
        if (numbers.size() == 1) {
            System.out.println("No");
            return;
        }
        int averageSum = 0;
        for (int i = 0; i < averageNumbers.size(); i++) {
            int num = Integer.parseInt(averageNumbers.get(i));
            averageSum += num;
        }
        if (averageSum <= 0) {
            Collections.sort(averageNumbers);
            for (String element : averageNumbers
                 ) {
                System.out.print(element + " ");
            }
            return;
        }
        Collections.sort(averageNumbers);
        Collections.reverse(averageNumbers);
        if (averageNumbers.size() < 5) {
            for (String element : averageNumbers
            ) {
                System.out.print(element + " ");
            }
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.print(averageNumbers.get(i) + " ");
            }
        }
    }
    }

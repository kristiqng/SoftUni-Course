    package ProgrammingFundamentalsMidExams;

    import java.util.Arrays;
    import java.util.Scanner;

    public class ArrayModifierProblem2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            String input = scanner.nextLine();
            while (!input.equals("end")) {
                if (input.contains("swap")) {
                    int index1 = Integer.parseInt(input.split(" ")[1]);
                    int index2 = Integer.parseInt(input.split(" ")[2]);
                    int value1 = numbers[index1];
                    int value2 = numbers[index2];
                    numbers[index1] = value2;
                    numbers[index2] = value1;

                } else if (input.contains("multiply")) {
                    int index1 = Integer.parseInt(input.split(" ")[1]);
                    int index2 = Integer.parseInt(input.split(" ")[2]);
                    int sum = numbers[index1] * numbers[index2];
                    numbers[index1] = sum;
                } else if (input.contains("decrease")) {
                    int size = numbers.length - 1;
                    for (int i = 0; i <= size; i++) {
                        numbers[i] -= 1;
                    }
                }
                input = scanner.nextLine();
            }
            for (int i = 0; i < numbers.length - 1; i++) {
                System.out.print(numbers[i] + ", ");
            }
            System.out.print(numbers[numbers.length - 1]);
        }
    }

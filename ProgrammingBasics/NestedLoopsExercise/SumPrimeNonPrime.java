package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int primeNumbers = 0;
        int nonPrimeNumbers = 0;
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isPrime = true;
            if (number < 0) {
                System.out.printf("Number is negative.%n");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < number; i++){
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers += number;
                input = scanner.nextLine();
            } else {
                nonPrimeNumbers += number;
                input = scanner.nextLine();
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeNumbers);
    }
}

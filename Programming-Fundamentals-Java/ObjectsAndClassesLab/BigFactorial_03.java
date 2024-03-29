package ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= number ; i++) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(factorial);
    }
}

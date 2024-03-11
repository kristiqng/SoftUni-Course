package BasicSyntaxCondiStatementsLoopsExercise_MoreEx;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstN = Integer.parseInt(scanner.nextLine());
        int secondN = Integer.parseInt(scanner.nextLine());
        int thirdN = Integer.parseInt(scanner.nextLine());
        int one = 0;
        int two = 0;
        int three = 0;
        if (firstN > secondN && firstN > thirdN) {
            one = firstN;
        } else if (secondN > firstN && secondN > thirdN) {
            one = secondN;
        } else {
            one = thirdN;
        }
        if (firstN < one && firstN > secondN) {
            two = firstN;
        } else if (secondN < one && secondN > firstN) {
            two = secondN;
        } else if ( thirdN < one && thirdN > firstN){
            two = thirdN;
        }
        if (firstN < one && firstN < two) {
            three = firstN;
        } else if (secondN < one && secondN < two) {
            three = secondN;
        } else if ( thirdN < one && thirdN < two){
            three = thirdN;
        }
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}

package Arrays_Exercise;

import java.util.Scanner;

public class LongestSeqOfElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine().split(" ");
        String lastSeq = "";
        String currentSymbol = numbers[0];
        String bestSeq = currentSymbol;
        String currentSeq = "";
        for (int i = 1; i < numbers.length; i++) {
            //2  1  1  2  3  3  2  2  2  1
            //0  1  2  3  4  5  6  7  8  9 //obshto 10 simvola
            if (numbers[i].equals(currentSymbol)) {
                bestSeq += " " + numbers[i];
                lastSeq = bestSeq;

            } else {
                currentSymbol = numbers[i];
                bestSeq = currentSymbol;
            }
            if (lastSeq.length() > currentSeq.length()) {
                currentSeq = lastSeq;
            }
        }
        System.out.println(currentSeq);
    }
}

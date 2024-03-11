package WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = Integer.parseInt(scanner.nextLine());
        int sh = Integer.parseInt(scanner.nextLine());
        int totalPieces = d * sh;
        int startingPieces = totalPieces;
        int counterPieces = 0;
        boolean noMore = false;
        while (totalPieces >= 0) {
            String word = scanner.nextLine();
            if (word.equals("STOP")) {
                break;
            }
            int piece = Integer.parseInt(word);
            totalPieces -= piece;
            counterPieces+= piece;
            if (totalPieces < 0) {
                noMore = true;
                break;
            }
        }
        if (noMore) {
            System.out.printf("No more cake left! You need %d pieces more.", counterPieces - startingPieces);
        } else {
            System.out.printf("%d pieces are left.", startingPieces - counterPieces);
        }
    }
}

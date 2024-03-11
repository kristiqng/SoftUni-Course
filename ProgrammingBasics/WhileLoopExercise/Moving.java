package WhileLoopExercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int totalSpace = first * second * third;
        boolean noMore = false;
        int space = 0;
        int startingSpace = totalSpace;
        while (totalSpace >  0) {
            String word = scanner.nextLine();
            if (word.equals("Done")) {
                break;
            }
            int box = Integer.parseInt(word);
            totalSpace -= box;
            space += box;
            if (totalSpace < 0) {
                noMore = true;
                break;
            }
        }
        if (noMore) {
            System.out.printf("No more free space! You need %d Cubic meters more.", space - startingSpace);
        } else {
            System.out.printf("%d Cubic meters left.", startingSpace - space);
        }
    }
}

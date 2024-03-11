package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();  //troy
        String searchBook = scanner.nextLine(); ///sparta
        int bookCount = 0;
        boolean isFound = false;
        while (!searchBook.equals("No More Books")) {
            if (book.equals(searchBook)) {
                isFound = true;
                break;
            }
            bookCount++;
            searchBook = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}

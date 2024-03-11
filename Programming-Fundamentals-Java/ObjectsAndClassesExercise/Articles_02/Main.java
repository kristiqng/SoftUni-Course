package ObjectsAndClassesExercise.Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Article article = new Article(input[0], input[1], input[2]);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String[] commandInput = scanner.nextLine().split(": ");
            String command = commandInput[0];
            String newCommand = commandInput[1];
            if (command.equals("Edit")) {
                article.edit(newCommand);
            }
            if (command.equals("ChangeAuthor")) {
                article.change(newCommand);
            }
            if (command.equals("Rename")) {
                article.rename(newCommand);
            }
        }
        System.out.println(article.toString());
    }
}

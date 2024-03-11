package CondiStatementLab3;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
        //
        //· Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
        String food = scanner.nextLine();
        if (food.equals("banana") || food.equals("apple") || food.equals("kiwi") || food.equals("cherry") ||
        food.equals("lemon") || food.equals("grapes")) {
            System.out.println("fruit");
        } else if (food.equals("tomato") || food.equals("cucumber") || food.equals("pepper") || food.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}

package ObjectsAndClassesExercise.AdvertisementMessage_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Message message = new Message();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String output = message.getRandomMessage();
            System.out.println(output);
        }
    }
}

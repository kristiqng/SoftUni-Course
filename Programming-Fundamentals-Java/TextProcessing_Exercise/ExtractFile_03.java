package TextProcessing_Exercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\\\");
        String[] files = input[input.length - 1].split("\\.");
        System.out.printf("File name: %s%n", files[0]);
        System.out.printf("File extension: %s", files[1]);
    }
}

package DataTypesAndVariablesLab;

import java.util.Scanner;

public class TownInfo_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());
        String all = String.format("Town %s has population of %d and area %d square km.", city, population, area);
        System.out.println(all);
    }
}

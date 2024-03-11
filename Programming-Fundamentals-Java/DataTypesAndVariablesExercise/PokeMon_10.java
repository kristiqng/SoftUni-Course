package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int originalPokePower = pokePower;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int targetPoked = 0;
        while (pokePower >= distance) {
            pokePower -= distance;
            targetPoked += 1;
            if (pokePower == originalPokePower / 2) {
                if (exhaustionFactor != 0) {
                    pokePower /= exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(targetPoked);
    }
}

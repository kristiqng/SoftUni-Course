package AssociativeArraysLambdaStreamAPExercise;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> sides = new LinkedHashMap<>();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                String forceSide = input.split(" \\| ")[0];
                String forceUser = input.split(" \\| ")[1];
                if (!sides.containsKey(forceSide)) {
                    sides.put(forceSide, new ArrayList<>());
                }

                boolean isExist = false;

                for (List<String> list : sides.values()) {
                    if (list.contains(forceSide)) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    sides.get(forceSide).add(forceUser);
                }
            } else if (input.contains(" -> ")) {
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];

                sides.entrySet().forEach(entry -> entry.getValue().remove(forceUser));

                if (!sides.containsKey(forceSide)) {
                    sides.put(forceSide, new ArrayList<>());
                    sides.get(forceSide).add(forceUser);
                } else {
                    sides.get(forceSide).add(forceUser);
                }

                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
            input = scanner.nextLine();
        }
        sides.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0) //оставяме само тези записи, които отговарят на условието
                .forEach(entry -> {
                    //entry: key (team) -> value (list of players)
                    //"Side: {forceSide}, Members: {forceUsers.Count}
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}

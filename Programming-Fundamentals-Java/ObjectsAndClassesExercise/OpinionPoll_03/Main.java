package ObjectsAndClassesExercise.OpinionPoll_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] personInformation = scanner.nextLine().split(" ");
            String personName = personInformation[0];
            int personAge = Integer.parseInt(personInformation[1]);
            if (personAge > 30) {
                Person person = new Person (personName, personAge);
                people.add(person);
            }
        }
        for (Person person : people
             ) {
            System.out.printf("%s - %d", person.getName(), person.getAge());
            System.out.println();
        }
    }
}

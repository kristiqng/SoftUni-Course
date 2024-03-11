package ObjectsAndClassesLab.Students_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (!input.equals("end")) {
            String studentFirstName = input.split(" ")[0];
            String studentLastName = input.split(" ")[1];
            int studentAge = Integer.parseInt(input.split(" ")[2]);
            String studentCity = input.split(" ")[3];
            Student student = new Student (studentFirstName, studentLastName, studentAge, studentCity);
            students.add(student);
            input = scanner.nextLine();
        }
        String searchingCity = scanner.nextLine();
        for (Student student : students
             ) {
            if (student.getCity().equals(searchingCity)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}

package ObjectsAndClassesLab.Students_06;

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

            Student student = findStudent(students, studentFirstName, studentLastName);
            if (student != null) {
                student.setAge(studentAge);
                student.setCity(studentCity);
            } else {
                students.add(new Student(studentFirstName, studentLastName, studentAge, studentCity));
            }
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
    public static Student findStudent(List<Student> students, String studentFirstName, String studentLastName) {
        for (Student student : students
        ) {
            if (student.getFirstName().equals(studentFirstName) && student.getLastName().equals(studentLastName)) {
                return student;
            }
        }
        return null;
    }

}
    /*public static int getExistingIndex(List<Student> students, String studentFirstName, String studentLastName) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getFirstName().equals(studentFirstName) && student.getLastName().equals(studentLastName)) {
                index = i;
            }
        }
        return index;
    }*/

    /*public static boolean IsStudentExisting(List<Student> students, String studentFirstName, String studentLastName) {
        for (Student student : students
        ) {
            if (student.getFirstName().equals(studentFirstName) && student.getLastName().equals(studentLastName)) {
                return true;
            }
        }
        return false;
    }
}*/

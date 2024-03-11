package FirstStepsInCodingLab;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Името на архитекта - текст
        //2. Брой на проектите, които трябва да изготви - цяло число в интервала [0 … 100]
        //"The architect {името на архитекта} will need
        // {необходими часове} hours to complete {брой на проектите} project/s."
        String name = scanner.nextLine();
        int buildings = Integer.parseInt(scanner.nextLine());
        int hoursToFinish = buildings * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hoursToFinish, buildings);
    }
}

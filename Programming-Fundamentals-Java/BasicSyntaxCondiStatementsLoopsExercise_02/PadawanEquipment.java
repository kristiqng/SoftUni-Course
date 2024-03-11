package BasicSyntaxCondiStatementsLoopsExercise_02;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());
        double totalLight = lightsabersPrice * Math.ceil(students * 1.10);
        double totalRobes = robesPrice * students ;
        double totalBelts = beltsPrice * (students - students / 6);
        double total = totalBelts + totalLight + totalRobes;
        if (money >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - money);
        }
    }
}

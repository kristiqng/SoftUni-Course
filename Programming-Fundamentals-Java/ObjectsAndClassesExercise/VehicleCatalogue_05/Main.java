package ObjectsAndClassesExercise.VehicleCatalogue_05;

import com.sun.source.doctree.SummaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();

        while (!command.equals("End")) {
            String typeOfVehicle = command.split(" ")[0];
            String modelOfVehicle = command.split(" ")[1];
            String colorOfVehicle = command.split(" ")[2];
            String horsepowerOfVehicle = command.split(" ")[3];
            Vehicle vehicle = new Vehicle(typeOfVehicle, modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
            vehicleList.add(vehicle);
            command = scanner.nextLine();
        }
        double averageHorsepowerCar = 0;
        double averageHorsepowerTruck = 0;
        int countCar = 0;
        int countTruck = 0;
        for (Vehicle vehicle : vehicleList
        ) {
            String typeOfVehicle = vehicle.getType();
            if (typeOfVehicle.equals("car")) {
                averageHorsepowerCar += Double.parseDouble(vehicle.getHorsepower());
                countCar++;
            }
            if (typeOfVehicle.equals("truck")) {
                countTruck++;
                averageHorsepowerTruck += Double.parseDouble(vehicle.getHorsepower());
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList
            ) {
                if (input.equals(vehicle.getModel())) {
                    System.out.println(vehicle.toString());
                }
            }
            input = scanner.nextLine();
        }
        double sumCar = averageHorsepowerCar / countCar;
        if (countCar == 0) {sumCar = 0;}
        System.out.printf("Cars have average horsepower of: %.2f.%n", sumCar);
        double sumTruck = averageHorsepowerTruck / countTruck;
        if (countTruck == 0) {sumTruck = 0;}
        System.out.printf("Trucks have average horsepower of: %.2f.", sumTruck);
    }
}

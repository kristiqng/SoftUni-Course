package ObjectsAndClassesExercise.VehicleCatalogue_05;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private String horsepower;

    public Vehicle (String type, String model, String color, String horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public String getCarIfExist() {
        return "Car";
    }
    public String getTruckIfExist() {
        return "Truck";
    }
    @Override
    public String toString() {
        String typeVeh = type.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVeh + "\n" +
                "Model: " +  model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + horsepower;
    }
}

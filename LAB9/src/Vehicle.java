public class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println("Vehicle is driving");
    }

    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Maximum Speed: " + maximumSpeed + " km/h");
    }
}

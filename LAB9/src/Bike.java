public class Bike extends Vehicle {

    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving");
    }
}

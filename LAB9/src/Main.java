public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Camry", 2020, 180);
        Bike myBike = new Bike("Yamaha", "R15", 2022, 130);

        myCar.printDetails();
        myCar.drive();

        myBike.printDetails();
        myBike.drive();
    }
}

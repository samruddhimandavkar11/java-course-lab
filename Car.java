import java.util.Scanner;

public class Car {
    String make;
    String model;
    short year;
    int price;

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car make: ");
        String make = sc.nextLine();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.print("Enter car year: ");
        short year = sc.nextShort();

        System.out.print("Enter car price: ");
        int price = sc.nextInt();

        Car userCar = new Car(make, model, year, price);


        System.out.println("\n`````Car Details `````");
        System.out.println("Make: " + userCar.make);
        System.out.println("Model: " + userCar.model);
        System.out.println("Year: " + userCar.year);
        System.out.println("Price: ₹" + userCar.price);

    }
}

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an animal to create (animal / dog / cat): ");
        String choice = sc.nextLine().toLowerCase();

        Animal obj;

        switch (choice) {
            case "dog":
                obj = new Dog();
                break;
            case "cat":
                obj = new Cat();
                break;
            case "animal":
                obj = new Animal();
                break;
            default:
                System.out.println("Invalid choice. Creating generic animal.");
                obj = new Animal();
        }

        obj.makeSound();
    }
}

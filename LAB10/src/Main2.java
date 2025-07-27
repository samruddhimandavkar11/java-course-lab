import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an animal to create (dog / cat): ");
        String choice = sc.nextLine().toLowerCase();

        Animal myAnimal;

        if (choice.equals("dog")) {
            myAnimal = new Dog();
        } else if (choice.equals("cat")) {
            myAnimal = new Cat();
        } else {
            System.out.println("Invalid choice. Creating a generic animal.");
            myAnimal = new Animal();
        }

        myAnimal.makeSound();
    }
}

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(7.0);           // radius = 7
        Shape rectangle = new Rectangle(5.0, 10.0); // width = 5, height = 10

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

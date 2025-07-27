public class Main2 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(4);
        Rectangle r = new Rectangle(6, 3);

        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Area of Square: " + s.getArea());
        System.out.println("Area of Rectangle: " + r.getArea());
    } 
}

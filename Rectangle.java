public class Rectangle{
    public static void main(String[] args) {

        int length1 = 10;
        int width1 = 5;
        int area1 = length1 * width1;


        int length2 = 8;
        int width2 = 6;
        int area2 = length2 * width2;


        System.out.println("Area of Rectangle1: " + area1);
        System.out.println("Area of Rectangle2: " + area2);


        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}

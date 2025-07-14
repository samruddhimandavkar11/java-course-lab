public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);
        System.out.println("Sum of 10 and 20: " + sum1);

        int sum2 = calc.add(5, 15, 25);
        System.out.println("Sum of 5, 15, and 25: " + sum2);

        double sum3 = calc.add(4.5, 3.2);
        System.out.println("Sum of 4.5 and 3.2: " + sum3);
    }
}

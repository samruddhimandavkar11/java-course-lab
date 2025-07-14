import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SimpleInterest, Rate;

        System.out.println("Enter principal amount:");
        int p = sc.nextInt();

        System.out.println("Enter time period (in years):");
        int t = sc.nextInt();

        if (p > 10000) {
            Rate = 10;
        } else if (p >= 5000) {
            Rate = 8;
        } else {
            Rate = 5;
        }

        SimpleInterest = (p * Rate * t) / 100;

        System.out.println("Interest Rate: " + Rate + "%");
        System.out.println("Simple Interest: " + SimpleInterest);


    }
}
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects:");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int marks4 = sc.nextInt();
        int marks5 = sc.nextInt();


        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        double avg = total / 5.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg > 90) {
            System.out.println("Grade: Ex");
        } else if (avg > 80) {
            System.out.println("Grade: A");
        } else if (avg > 60) {
            System.out.println("Grade: B");
        } else if (avg >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

    }
}

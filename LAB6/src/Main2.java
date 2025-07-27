public class Main2 {
    public static void main(String[] args) {

        //default
        Student s1 = new Student();
        //half info
        Student s2 = new Student("Samruddhi", 21);
        //full info
        Student s3 = new Student("Raj", 22, "Mechanical");


        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}


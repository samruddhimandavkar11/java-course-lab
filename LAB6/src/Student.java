public class Student {
    String name;
    int age;
    String department;

    // Default cons
    public Student() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }

    // Cons with name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    // Cons with full info
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // print method
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

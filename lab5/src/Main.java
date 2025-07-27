public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmployeeId(1);
        emp.setEmployeeName("Ravi");
        emp.setEmployeeSalary(45000.75);

        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getEmployeeName());
        System.out.println("Salary: " + emp.getEmployeeSalary());
    }
}

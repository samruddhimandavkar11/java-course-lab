public class Employee {
    // Private variables
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Setters
    public void setEmployeeId(int id) {
        employee_id = id;
    }

    public void setEmployeeName(String name) {
        employee_name = name;
    }

    public void setEmployeeSalary(double salary) {
        employee_salary = salary;
    }

    // Getters
    public int getEmployeeId() {
        return employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public String getEmployeeSalary() {
        return "₹" + employee_salary;
    }
}

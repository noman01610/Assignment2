
public class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee() {
    }

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(int id) {

        this.id = id;

        System.out.println("ID must be positive");

    }

    public void setName(String name) {

        this.name = name;

        System.out.println("Name cannot be empty");

    }

    public void setSalary(double salary) {

        this.salary = salary;

        System.out.println("Salary cannot be negative");

    }

    public void setDepartment(String department) {

        this.department = department;

        System.out.println("Department cannot be empty");

    }

    public void giveRaise(double percentage) {

        this.salary += salary * (percentage / 100);
        System.out.println("New salary: " + this.salary);

        System.out.println("Raise percentage must be positive");

    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=$" + salary + ", department=" + department + "]";
    }


    public static void main(String[] args) {
      
        Employee emp1 = new Employee(101, "John Doe", 50000, "IT");
        
      
        Employee emp2 = new Employee();
        emp2.setId(102);
        emp2.setName("Jane Smith");
        emp2.setSalary(45000);
        emp2.setDepartment("HR");
        
      
       
       
        System.out.println("\n=== Using toString ===");
        System.out.println(emp1);
    }
}
public class Employee extends People {
    protected String position, department;
    protected double salary;

    // constructors
    public Employee(String firstName, String lastName, 
    String address, int age, String position, String department, double salary) {
        super(firstName, lastName, address, age);
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    // getters
    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // setters
    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
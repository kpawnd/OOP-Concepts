public abstract class Employee {
    protected String name, id;
    protected double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract double calculateNetSalary();
}
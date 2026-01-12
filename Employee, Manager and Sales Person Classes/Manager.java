public class Manager extends Employee implements Taxable {

    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }

    public double calculateNetSalary() {
        return salary+500;
    }

    public double calculateTax() {
        return calculateNetSalary() * 0.05;
    }
}
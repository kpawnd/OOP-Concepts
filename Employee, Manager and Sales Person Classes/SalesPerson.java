public class SalesPerson extends Employee implements Taxable {

    public SalesPerson(String name, String id, double salary) {
        super(name, id, salary);
    }

    public double calculateNetSalary() {
        return salary+(0.10*salary);
    }

    public double calculateTax() {
        return calculateNetSalary() * 0.05;
    }
}
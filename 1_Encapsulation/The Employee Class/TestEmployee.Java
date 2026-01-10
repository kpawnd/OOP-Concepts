public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getSalary());
        System.out.println(e1.getAnnualSalary());

        e1.setSalary(6700);
        System.out.println(e1.getSalary());
        System.out.println(e1.getAnnualSalary());
    }
}
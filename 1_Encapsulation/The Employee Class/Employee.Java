public class Employee {
    private int id, salary;
    private String firstName, lastName;

    public Employee(int ident, String firstN, 
        String lastN, int sal) {
            this.id = ident;
            this.salary = sal;
            this.firstName = firstN;
            this.lastName = lastN;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName+" "+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int s) {
        this.salary = s;
        return salary;
    }

    public int getAnnualSalary() {
        return salary*12;
    }
}
Create an abstract class Employee.

Protected attributes: String name, String id, double baseSalary.

Constructor to initialize them.

Abstract method: calculateNetSalary().

Create a subclass Manager that extends Employee.

Adds a bonus of RM 500 to the base salary for net calculation.

Create a subclass SalesPerson that extends Employee.

Adds a commission of 10% of the base salary for net calculation.

Create an interface Taxable with a method calculateTax().

Modify both subclasses to implement Taxable.

Tax is 5% of calculateNetSalary().
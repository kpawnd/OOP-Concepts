public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", "123 Main Street");
        System.out.println(person1);
        
        Student student1 = new Student("Alice Smith", "456 Oak Avenue", "Computer Science", 2, 5000.0);
        System.out.println(student1);
        student1.setProgram("Information Technology");
        System.out.println("After updating program: " + student1);
        
        Student student2 = new Student("Bob Johnson", "789 Pine Road", "Engineering", 3, 7500.0);
        System.out.println(student2);
        
        Staff staff1 = new Staff("Dr. Sarah Williams", "321 Elm Street", "Science Department", 45000.0);
        System.out.println(staff1);
        staff1.setPay(50000.0);
        System.out.println("After updating pay: " + staff1);
        
        Staff staff2 = new Staff("Mr. Michael Brown", "654 Maple Lane", "Math Department", 40000.0);
        System.out.println(staff2);
        
        System.out.println("Students: " + student1.getName() + " and " + student2.getName());
        System.out.println("Staff: " + staff1.getName() + " and " + staff2.getName());
    }
}
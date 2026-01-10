public class Person {
    private String name, address;

    public Person(String n, String a) {
        this.name = n;
        this.address = a;
    }

    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    @Override
    public String toString() {
        return "Person[Name=" + name + ", Address=" + address + "]";
    }
}
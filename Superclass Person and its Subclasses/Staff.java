public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String n, String a, String s, double p) {
        super(n, a);
        this.school = s;
        this.pay = p;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String s) {
        this.school = s;
    }

    public void setPay(double p) {
        this.pay = p;
    }

    @Override
    public String toString() {
        return "Staff[Name=" + getName() + ", Address=" + getAddress() + ", School=" + school + ", Pay=" + pay + "]";
    }
}
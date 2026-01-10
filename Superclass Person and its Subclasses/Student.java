public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String n, String a, String p, int y, double f) {
        super(n, a);
        this.year = y;
        this.fee = f;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return year;
    }

    public void setProgram(String p) {
        this.program = p;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public void setFee(double f) {
        this.fee = f;
    }

    @Override
    public String toString() {
        return "Student[Name=" + getName() + ", Address=" + getAddress() + ", Program=" + program + ", Year=" + year + "]";
    }
}
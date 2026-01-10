public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle (double r) {
        this.radius = r;
        color = "red";
    }

    public Circle (double r, String c) {
        this.radius = r;
        this.color = c;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String c) {
        this.color = c;
        return color;
    }

    public double setRadius(double r) {
        this.radius = r;
        return radius;
    }
}
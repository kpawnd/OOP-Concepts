public class Circle {
    protected double radius = 1.0;
    protected String color = "red";

     public Circle() {
        this.radius = 1.0;
        this.color = "red";
     }

     public Circle(double r) {
        this.radius = r;
        this.color = "red";
     }

     public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
     }

     public double getRadius() {
        return radius;
     }

     public String getColor() {
        return color;
     }

     public double getArea() {
        return radius*radius*Math.PI;
     }

     public void setRadius(double r) {
        this.radius = r;
     }

     public void setColor(String c) {
        this.color = c;
     }

     @Override
     public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
     }
}
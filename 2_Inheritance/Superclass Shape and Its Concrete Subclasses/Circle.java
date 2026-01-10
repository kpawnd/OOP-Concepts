public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(double r, String c, Boolean f) {
        super(c, f);
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public String toString() {
        return "Circle[color=" + getColor() + ", filled=" + isFilled() + ", radius=" + radius + "]";
    }
}
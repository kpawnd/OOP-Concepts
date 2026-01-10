public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
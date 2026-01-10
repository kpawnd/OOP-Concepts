public class Rectangle implements GeometricObject {
    protected double width, length;

    public Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + "length=" + length + "]";
    }
}
public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }

    public Rectangle(double w, double l, String c, Boolean f) {
        super(c, f);
        this.width = w;
        this.length = l;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public void setLength(double l) {
        this.length = l;
    }

    public double getArea() {
        return width*length;
    }

     public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[color=" + getColor() + ", filled=" + isFilled() + ", width=" + width + ", length=" + length + "]";
    }
}
public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float l, float w) {
        this.length = l;
        this.width = w;
    }

    public float getLength() {
        return length;
    }

    public float setLength(float l) {
        this.length = l;
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float setWidth(float w) {
        this.width = w;
        return width;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*(length+width);
    }
}
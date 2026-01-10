public abstract class Shape {
    protected String color = "red";
    protected Boolean filled = true;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String c, Boolean f) {
        this.color = c;
        this.filled = f;
    }

    public String getColor() {
        return color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public void setFilled(Boolean f) {
        this.filled = f;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }

}
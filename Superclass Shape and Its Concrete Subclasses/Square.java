public class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double s) {
        super(s, s);
    }

    public Square(double s, String c, Boolean f) {
        super(s, s, c, f);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double s) {
        super.setLength(s);
        super.setWidth(s);
    }

    @Override
    public void setWidth(double w) {
        setSide(w);
    }

    @Override
    public void setLength(double l) {
        setSide(l);
    }

    @Override
    public String toString() {
        return "Circle[color=" + getColor() + ", filled=" + isFilled() + ", width=" + width + ", length=" + length + "]";
    }
}
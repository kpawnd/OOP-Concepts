public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());

        Circle c2 = new Circle(6.7, "blue");
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        System.out.println(c2.getColor());

        Circle c3 = new Circle();
        c3.setRadius(5.5);
        c3.setColor("green");
        System.out.println(c3.getRadius());
        System.out.println(c3.getArea());
        System.out.println(c3.getColor());
    }
} 
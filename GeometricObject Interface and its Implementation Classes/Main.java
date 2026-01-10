public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        
        Circle circle2 = new Circle(3.0);
        System.out.println("\n" + circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        
        Rectangle rect1 = new Rectangle(4.0, 6.0);
        System.out.println(rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        
        Rectangle rect2 = new Rectangle(3.0, 5.0);
        System.out.println("\n" + rect2);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}

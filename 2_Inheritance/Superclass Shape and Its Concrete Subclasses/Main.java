public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle: " + rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        
        Rectangle rect2 = new Rectangle(5.0, 4.0);
        System.out.println("\nRectangle(5, 4): " + rect2);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        
        Rectangle rect3 = new Rectangle(6.0, 3.0, "blue", false);
        System.out.println("\nRectangle(6, 3, blue, false): " + rect3);
        System.out.println("Area: " + rect3.getArea());
        System.out.println("Perimeter: " + rect3.getPerimeter());
        
        rect3.setWidth(8.0);
        rect3.setLength(2.0);
        System.out.println("After updating width to 8.0 and length to 2.0:");
        System.out.println("Rectangle: " + rect3);
        System.out.println("Area: " + rect3.getArea());
        
        Circle circle1 = new Circle();
        System.out.println("Default Circle: " + circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        
        Circle circle2 = new Circle(5.0);
        System.out.println("\nCircle(5.0): " + circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        
        Circle circle3 = new Circle(3.0, "green", true);
        System.out.println("\nCircle(3.0, green, true): " + circle3);
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Perimeter: " + circle3.getPerimeter());
        
        circle3.setRadius(7.0);
        circle3.setColor("yellow");
        System.out.println("After updating radius to 7.0 and color to yellow:");
        System.out.println("Circle: " + circle3);
        System.out.println("Area: " + circle3.getArea());
        
        Square square1 = new Square();
        System.out.println("Default Square: " + square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        
        Square square2 = new Square(4.0);
        System.out.println("\nSquare(4.0): " + square2);
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
        
        Square square3 = new Square(5.0, "red", true);
        System.out.println("\nSquare(5.0, red, true): " + square3);
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimeter: " + square3.getPerimeter());
        
        square3.setSide(6.0);
        square3.setColor("purple");
        System.out.println("After updating side to 6.0 and color to purple:");
        System.out.println("Square: " + square3);
        System.out.println("Area: " + square3.getArea());
    }
}

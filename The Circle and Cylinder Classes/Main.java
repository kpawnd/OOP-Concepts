public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println();
        
        Circle circle2 = new Circle(5.0);
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println();
        
        Circle circle3 = new Circle(3.0, "blue");
        System.out.println(circle3);
        System.out.println("Area: " + circle3.getArea());
        System.out.println();
        
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder[radius=" + cylinder1.getRadius() + ", color=" + cylinder1.getColor() + ", height=" + cylinder1.height + "]");
        System.out.println("Volume: " + cylinder1.getVolume());
        System.out.println();
        
        Cylinder cylinder2 = new Cylinder(2.0);
        System.out.println("Cylinder[radius=" + cylinder2.getRadius() + ", color=" + cylinder2.getColor() + ", height=" + cylinder2.height + "]");
        System.out.println("Volume: " + cylinder2.getVolume());
        System.out.println();
        
        Cylinder cylinder3 = new Cylinder(4.0, 10.0);
        System.out.println("Cylinder[radius=" + cylinder3.getRadius() + ", color=" + cylinder3.getColor() + ", height=" + cylinder3.height + "]");
        System.out.println("Volume: " + cylinder3.getVolume());
        System.out.println();
        
        cylinder3.setRadius(5.0);
        cylinder3.setColor("green");
        cylinder3.setHeight(15.0);
        System.out.println("After updates:");
        System.out.println("Cylinder[radius=" + cylinder3.getRadius() + ", color=" + cylinder3.getColor() + ", height=" + cylinder3.height + "]");
        System.out.println("Volume: " + cylinder3.getVolume());
    }
}

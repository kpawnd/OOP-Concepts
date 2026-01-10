public class Cylinder extends Circle {
    protected double height = 1.0;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double h) {
        super();
        height = h;
    }

    public Cylinder(double r, double h) {
      super(r);
      this.height = h;
   }

   public double getHeight(double h) {
    return height;
   }

   public double getVolume() {
    return Math.PI*radius*radius*height;
   }

   public void setHeight(double h) {
    this.height = h;
   }
}
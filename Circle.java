import java.lang.Math;

public class Circle extends Shape {
    public double radius;
    public Circle() {
        super("Circle", 2 * Math.PI, Math.PI);
        this.radius = 1;
    }
    public Circle(double rad) {
        super("Circle", 2 * Math.PI * rad, Math.PI * rad * rad);
        this.radius = rad;
    }
}

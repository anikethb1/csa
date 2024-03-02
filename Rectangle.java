public class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle() {
        super("Rectangle", 6, 2);
        this.length = 1;
        this.width = 2;
    }

    public Rectangle(int len) {
        super("Square", 4 * len, len * len);
        this.length = len;
        this.width = len;
    }

    public Rectangle(int len, int wid) {
        super("Rectangle", 2 * (len + wid), len * wid);
        this.length = len;
        this.width = wid;
    }
}

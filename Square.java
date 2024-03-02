public class Square extends Shape {
    public int length;

    public Square() {
        super("Square", 4 * 1, 1 * 1);
        this.length = 1;
    }

    public Square(int len) {
        super("Square", 4 * len, len * len);
        this.length = len;
    }
}

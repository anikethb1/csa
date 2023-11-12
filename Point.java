import java.lang.Math;

public class Point {
    private int xCoordinate;
    private int yCoordinate;

    public Point() {
        xCoordinate  = 0;
        yCoordinate = 0;
    }

    public Point(int x, int y) {
        xCoordinate = x;
        yCoordinate = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2));
    }

    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(xCoordinate - other.xCoordinate, 2) + Math.pow(yCoordinate - other.yCoordinate, 2));
    }

    public int getX() {
        return xCoordinate;
    }

    public int getY() {
        return yCoordinate;
    }

}
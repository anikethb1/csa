public class Shape {
    public String name;
    public double perimeter;
    public double area;

    public Shape(String name, double perimeter, double area) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    public String toString() {
        return "Name: " + name + "\nPerimeter: " + perimeter + "\nArea: " + area;
    }

    public boolean equals(Shape other) {
        return this.toString().equals(other.toString());
    }
}

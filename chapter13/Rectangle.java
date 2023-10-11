package chapter13;

public class Rectangle extends GeometricObject {
    private double height = 1;
    private double length = 1;

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * (height + length);
    }

    @Override /** Return perimeter */
    public double getArea() {
        return height * length;
    }
}

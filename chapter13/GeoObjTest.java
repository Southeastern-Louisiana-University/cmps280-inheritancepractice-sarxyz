package chapter13;

public class GeoObjTest {
    public static void main(String args[]){
        Circle circle = new Circle();
        System.out.println(circle.toString());
        GeometricObject geoObj1 = new Rectangle();
        System.out.println("printing geoObj1.toString() " + geoObj1.toString());
    }
}

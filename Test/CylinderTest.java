public class CylinderTest {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println("The cylinder has radius of " + c1.getRadius() + " and area of " + c1.getArea() + " and volume of " + c1.getVolume());
        Cylinder c2 = new Cylinder(2.0);
        System.out.println("The cylinder has radius of " + c2.getRadius() + " and area of " + c2.getArea() + " and volume of " + c2.getVolume());
        Cylinder c3 = new Cylinder(3.0, 3.0);
        System.out.println("The cylinder has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and volume of " + c3.getVolume());
    }
}

public class CylindersTest {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println("The cylinder has radius of " + c1.getRadius() + ", height of " + c1.getHeight() + ", area of " + c1.getArea() + ", and volume of " + c1.getVolume());
        Cylinder c2 = new Cylinder(2.0);
        System.out.println("The cylinder has radius of " + c2.getRadius() + ", height of " + c2.getHeight() + ", area of " + c2.getArea() + ", and volume of " + c2.getVolume());
        Cylinder c3 = new Cylinder(3.0, 3.0);
        System.out.println("The cylinder has radius of " + c3.getRadius() + ", height of " + c3.getHeight() + ", area of " + c3.getArea() + ", and volume of " + c3.getVolume());

        Cylinders cylinders = new Cylinders();
        cylinders.addCylinders();
    }
}

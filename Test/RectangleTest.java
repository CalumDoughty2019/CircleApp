public class RectangleTest {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        System.out.println("The rectangle has width of " + r1.getWidth() + "\nand length of " + r1.getLength() + "\nand area of " + r1.getArea() +
                "\nand perimeter of " + r1.getPerimeter() + "\nand colour is " + r1.getColour() + "\nand filled is " + r1.isFilled());
        System.out.println("");

        Rectangle r2 = new Rectangle("blue", true, 2.5, 7);
        System.out.println("The rectangle has width of " + r2.getWidth() + "\nand length of " + r2.getLength() + "\nand area of " + r2.getArea() +
                "\nand perimeter of " + r2.getPerimeter() + "\nand colour is " + r2.getColour() + "\nand filled is " + r2.isFilled());
    }
}

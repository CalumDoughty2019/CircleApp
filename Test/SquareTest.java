//BROKEN, FIX NEXT TIME. insufficient information to complete this stage

public class SquareTest {
    public static void main(String[] args) {

        Square s1 = new Square();
        System.out.println("The square has width of " + s1.getWidth() + "\nand length of " + s1.getLength() + "\nand area of " + s1.getArea() +
                "\nand perimeter of " + s1.getPerimeter() + "\nand colour is " + s1.getColour() + "\nand filled is " + s1.isFilled());
        System.out.println("");

        Square s2 = new Square("yellow", true, 0);
        System.out.println("The square has width of " + s2.getWidth() + "\nand length of " + s2.getLength() + "\nand area of " + s2.getArea() +
                "\nand perimeter of " + s2.getPerimeter() + "\nand colour is " + s2.getColour() + "\nand filled is " + s2.isFilled());
        System.out.println("");

        Square s3 = new Square("yellow", true, 4);
        s3.setWidth(2);
        s3.setLength(5);
        System.out.println("The square has width of " + s3.getWidth() + "\nand length of " + s3.getLength() + "\nand area of " + s3.getArea() +
                "\nand perimeter of " + s3.getPerimeter() + "\nand colour is " + s3.getColour() + "\nand filled is " + s3.isFilled());
    }
}

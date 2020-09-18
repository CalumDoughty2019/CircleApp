public class Rectangle extends Shape{
    //variables
    private double width;
    private double length;

    //getters & setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    //CONSTRUCTORS
    //default constructor
    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    //constructor1
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    //constructor2
    public Rectangle(String colour, boolean filled, double width, double length){
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    //methods & functions
    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return (2*length)+(2*width);
    }

    @Override
    public String toString(){
        return Double.toString(length);
    }
}

public class Circle extends Shape{
    //variables
    private double radius;
    private String colour;

    //getters and setters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }


    // The default constructor with no argument.
    // It sets the radius to their default value.
    public Circle() {
        super();
        radius = 1.0;
        this.colour = "red";
    }
    // 2nd constructor with given radius, but color default
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    // 2nd constructor with given radius and colour values
    public Circle(double radius, String colour) {
        super();
        this.radius = radius;
        this.colour = colour;
    }

    //methods & functions
    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter(){
        return (2*radius)*Math.PI;
    }

    @Override
    public String toString(){
        return "Circle[radius=" + radius + ",colour=" + colour + "]";
    }
}

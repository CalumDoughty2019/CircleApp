public class Circle {
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

    public double getColour() {
        return radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // The default constructor with no argument.
    // It sets the radius and color to their default value.
    public Circle() {
        radius = 1.0;
        colour = "red";
    }
    // 2nd constructor with given radius, but color default
    public Circle(double radius) {
        this.radius = radius;
        colour = "red";
    }
    // 2nd constructor with given radius and colour values
    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    //methods & functions
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getArea(double rad){
        return rad*rad*Math.PI;
    }
}

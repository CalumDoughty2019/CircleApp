public abstract class Shape {
    //variables
    private String colour;
    private boolean filled;

    //getters & setters
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //CONSTRUCTORS
    //default constructor
    public Shape(){
        colour = "red";
        filled = false;
    }
    //constructor1
    public Shape(String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
    }

    //methods & functions
    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}

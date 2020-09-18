public class Cylinder extends Circle {
    //variables
    private double height;

    //getters & setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //constructor
    public Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double radius){
        super(radius);
        height = 1.0;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, String colour, boolean filled, double height){
        super(radius, colour, filled);
        this.height = height;
    }

    //methods & functions
    public double getVolume(){
        return getArea()*height;
    }
}

public class Square extends Rectangle{
    //variables
    private double side;

    //getters & setters
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    //CONSTRUCTORS
    //default constructor
    public Square(){
        super();
        side = 1;
    }
    //constructor1
    public Square(double side){
        super();
        this.side = side;
    }
    //constructor2
    public Square(String colour, boolean filled, double side){
        super();
        this.side = side;
    }

    //methods & functions
    @Override
    public void setWidth(double side){
        setWidth(side);
    }

    public void setWidth(){

    }

    @Override
    public void setLength(double side){
        setLength(side);
    }

    @Override
    public String toString(){
        return Double.toString(side);
    }
}

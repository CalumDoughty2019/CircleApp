import java.text.DecimalFormat;
import java.util.Scanner;

public class Cylinders {
    DecimalFormat df = new DecimalFormat("#0.000");

    //variables
    Cylinder[] cylinders;

    //Allow the user to input up to 100 cylinders
    public void addCylinders(){
        Scanner scanner = new Scanner(System.in);
        int numCylinders;
        //Cylinder[] cylinders;
        //double radius;

        //could use an if here to throw error message (I have opted for do-while)
        do {
            System.out.println("Please enter number of cylinders: ");
            numCylinders = scanner.nextInt();
            cylinders = new Cylinder[numCylinders];
            System.out.println("");
        } while (numCylinders < 0 || numCylinders > 100);

        for (int i = 0; i < cylinders.length; i++) {
            Cylinder anotherOne = new Cylinder();
            int j = i+1;
            System.out.println("Cylinder No. " + j + ": ");
            System.out.println("Please enter a radius: ");
            anotherOne.setRadius(scanner.nextDouble());
            System.out.println("Please enter a height: ");
            anotherOne.setHeight(scanner.nextDouble());
            System.out.println("Please enter a colour: ");
            anotherOne.setColour(scanner.next());

            cylinders[i] = anotherOne;
            System.out.println("");
        }
    }

    //used to create a number of cylinders
    public void generateCylinders(){
        Scanner scanner = new Scanner(System.in);
        int numCylinders;
        //Cylinder[] cylinders;
        //double radius;

        //could use an if here to throw error message (I have opted for do-while)
        do {
            System.out.println("Please enter number of cylinders: ");
            numCylinders = scanner.nextInt();
            cylinders = new Cylinder[numCylinders];
            System.out.println("");
        } while (numCylinders < 0 || numCylinders > 100);

        for (int i = 0; i < cylinders.length; i++) {
            Cylinder anotherOne = new Cylinder();
            int j = i+1;
            //System.out.println("Cylinder No. " + j + ": ");
            //System.out.println("Please enter a radius: ");
            anotherOne.setRadius(1 + (int)(Math.random() * ((10 - 1) + 1)));
            anotherOne.setHeight(1 + (int)(Math.random() * ((10 - 1) + 1)));
            anotherOne.setColour("red");

            cylinders[i] = anotherOne;
            System.out.println("");
        }

        viewCylinders();
    }

    //Allow the user to view up to 100 cylinders
    public void viewCylinders(){
        for (int i = 0; i < cylinders.length; i++) {
            int j = i+1;
            if(i == 0){
                System.out.println("---------------------------------------------------------------");
            }
            System.out.println("Cylinder No. " + j + ":");
            System.out.println("Radius: " + cylinders[i].getRadius());
            System.out.println("Height: " + cylinders[i].getHeight());
            System.out.println("Colour: " + cylinders[i].getColour());
            System.out.println("Area (%3dp): " + df.format(cylinders[i].getArea()));
            System.out.println("Volume (%3dp): " + df.format(cylinders[i].getVolume()));
            System.out.println("---------------------------------------------------------------");
        }
    }
}

// Constructor Overloading 
import java.io.*;
import java.util.*;

// Class Declaration
class Box
{
    double width, height, depth;

    // Constructor Declaration with parameters
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor Declaration without parameters 
    Box()
    {
        width = height = depth = 0;
    }

    // Constructor used when cube is created 
    Box(double len)
    {
        width = height = depth = len;
    }


    // Calculating and returning Volume 
    double volume()
    {
        return width * height * depth;
    }
}

// Main Class
public class Test
{
    public static void main(String[] args) {
        // create boxes using various constructor 
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // get volume of second box
        vol = mybox1.volume();
        System.out.println(" Volume of mybox1 is " + vol);

        // get volume of cube 
        vol = mycube.volume();
        System.out.println(" Volume of mycube is " + vol);
    }
}
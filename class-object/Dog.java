//Class and Object 
import java.io.*;
import java.util.*;

// Class Declaration
public class Dog
{
    String name;
    String breed;
    int age; 
    String color;

    // Constructor Declaration
    public Dog(String name, String breed, int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
        // Method 1 
        public String getName()
        {
            return name;
        }

        // Method 2
        public String getBreed()
        {
            return breed;
        }

        // Method 3 
        public int getAge()
        {
            return age;
        }

        // Method 4 
        public String getColor()
        {
            return color;
        }

    //Printing the output
    public String toString()
    {
        return("Hi my name is " + this.getName()+".\nMy breed, age and color are " + this.getBreed() + "," + this.getAge() + " and " + this.getColor());
    }

    // Main Function 
    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}
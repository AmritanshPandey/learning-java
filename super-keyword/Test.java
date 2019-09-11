// Using Super Keyword
import java.io.*;
import java.util.*;

// Class Declaration
class Hello
{
    void message()
    {
        System.out.printlin("Hello!");
    }
}

class Messages extends Hello {
    void message()
    {
        System.out.println("Welcome to our party!");
    }
    void display()
    {
        message();
        super.message();
    }
}


// Main Class 
class Test 
{
    public static void main(String[] args) {
        {
            Messages s = new Messages();
            s.display();
        }
    }
}


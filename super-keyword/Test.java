// Using Super Keyword
import java.io.*;
import java.util.*;

// Class Declaration
class Hello
{
    void message()
    {
        System.out.println("Welcome to our Party");
    }
}

class Messages extends Hello {
    void message()
    {
        System.out.println("Hello!");
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


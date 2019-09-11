// Using Super Keyword with Constructor
import java.io.*;
import java.util.*;

// Class Declaration
class Hello
{
    Hello()
    {
        System.out.println("Hello!");
    }
}

class Messages extends Hello {
    Messages()
    {
        super();
        System.out.println("Welcome to our party!");
    }
}  
// Main Class 
class Test 
{
    public static void main(String[] args) 
        {
            Messages s = new Messages();
        }
}


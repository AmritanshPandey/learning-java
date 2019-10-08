import java.io.*; 
  
interface in1 
{  
    final int a = 10;  
    void display(); 
} 
  
class test implements in1 
{ 
    public void display() 
    { 
        System.out.println("Hello World!"); 
    } 
  
    public static void main (String[] args) 
    { 
        test t = new test(); 
        t.display(); 
        System.out.println(a); 
    } 
} 
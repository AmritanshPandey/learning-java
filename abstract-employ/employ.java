// Abstract Class
import java.io.*;
//Abstract Class Declaration
abstract class employ {
// Abstract Function Declaration
abstract int getsal();
}

// First Derived Class Declaration 
class developer extends employ {
    int salary;
	developer(int s){
        salary = s;
    }
    int getsal(){
        return salary;
    }
}

// Second Derived Class Declaration
class driver extends employ {
    int salary;
	driver(int s){
        salary = s;
    }	
    int getsal(){
    return salary;
}
	
}

// Main CLass
class demo {

	public static void main(String args[ ])
	{
		developer d1=new developer(50000);  
        driver d2= new driver(30000);
        System.out.println("salary of developer is : " + d1.getsal());
        System.out.println("salary of driver is : " + d2.getsal());
	}
}
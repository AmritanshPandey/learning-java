import java.io.*;
abstract class employ {
abstract int getsal();
}

class developer extends employ {
    int salary;
	developer(int s){
        salary = s;
    }
    int getsal(){
        return salary;
    }
}

class driver extends employ {
    int salary;
	driver(int s){
        salary = s;
    }	
    int getsal(){
    return salary;
}
	
}
			
class demo {

	public static void main(String args[ ])
	{
		developer d1=new developer(50000);  
        driver d2= new driver(30000);
        System.out.println("salary of developer is : " + d1.getsal());
        System.out.println("salary of driver is : " + d2.getsal());
	}
}
// Java program to show encapsulation 
public class Encapsulate 
{ 

    private String StudentName; 
    private int StudentRoll; 
    private int StudentAge; 
  
    public int getAge()  
    { 
      return StudentAge; 
    } 
    
    public String getName()  
    { 
      return StudentName; 
    } 
      
    public int getRoll()  
    { 
       return StudentRoll; 
    } 
   
    
    public void setAge( int newAge) 
    { 
      StudentAge = newAge; 
    } 

    public void setName(String newName) 
    { 
      StudentName = newName; 
    } 

    public void setRoll( int newRoll)  
    { 
      StudentRoll = newRoll; 
    } 
} 


class Test 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
           
        obj.setName("Ashish"); 
        obj.setAge(21); 
        obj.setRoll(15); 
           
        System.out.println("Student's name: " + obj.getName()); 
        System.out.println("Student's age: " + obj.getAge()); 
        System.out.println("Students's roll: " + obj.getRoll()); 
                 
    } 
} 
import java.util.*; 
import java.io.*; 
  
class Name 
{ 
    public void StudentName() 
    { 
        System.out.println("Name: Kevin"); 
    } 
} 
  
class Subject extends Name
{ 
    public void StudentSubject() 
    { 
        System.out.println("Subject: Maths"); 
    } 
} 

class Rollno extends Name
{ 
    public void StudentRollno() 
    { 
        System.out.println("Roll Number: 123"); 
    } 
} 

class Test 
{ 
    public static void main(String[] args) 
    { 
        Rollno g = new Rollno(); 
        g.StudentName(); 
        Subject t = new Subject();
        t.StudentSubject(); 
        g.StudentRollno();
    } 
}


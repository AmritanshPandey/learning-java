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

class Rollno extends Subject
{ 
    public void StudentRollno() 
    { 
        System.out.println("Roll Number: 123"); 
    } 
} 

class Demo 
{ 
    public static void main(String[] args) 
    { 
        Rollno g = new Rollno(); 
        g.StudentName(); 
        g.StudentSubject(); 
        g.StudentRollno();
    } 
} 
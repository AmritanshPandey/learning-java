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


class Main 
{ 
    public static void main(String[] args) 
    { 
        Subject g = new Subject(); 
        g.StudentName(); 
        g.StudentSubject(); 
    } 
} 
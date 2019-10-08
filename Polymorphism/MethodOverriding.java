// Run time polymorphism is achieved by Method Overridng
// Base Class 
class Parent { 
    void show() 
    { 
        System.out.println("Parent' Name: Mr. John"); 
    } 
} 
  
// Derived class
class Child extends Parent { 

    void show() 
    { 
        System.out.println("Child's Name: Daniel"); 
    } 
} 
  
// Main class 
class Demo { 
    public static void main(String[] args) 
    { 
 
        Parent obj1 = new Parent(); 
        obj1.show(); 

        Parent obj2 = new Child(); 
        obj2.show(); 
    } 
} 
import java.util.Scanner; 
public class scanner
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Name: "); 
        String name = sc.nextLine(); 
        System.out.print("Enter Gender: ");
        char gender = sc.next().charAt(0); 
        System.out.print("Enter Age: ");
        int age = sc.nextInt(); 
        System.out.print("Enter Mobile Number: ");
        long mobileNo = sc.nextLong();
        System.out.print("Enter CGPA: "); 
        double cgpa = sc.nextDouble(); 

        System.out.println("****************************************************");
  
        System.out.println("Name: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA: "+cgpa); 
    } 
} 
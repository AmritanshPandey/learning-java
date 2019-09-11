// Exception Handling in Java
import java.io.*;
import java.util.*;

class Exception {
   static int divideByZero(int a, int b){
        int i = a/b;
        return i;
    }

    static int computeDivision(int a, int b){
        int res = 0;


        // Number Format Exception Handling
        try {
            res = divideByZero(a,b);
        } catch (NumberFormatException e) {
                        System.out.println("NumberFormatException is occured");
                    }
        return res;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // Arithmetic Exception Handling
        try {
            int i = computeDivision(a,b);
        } catch (ArithmeticException e) {
            System.out.println("Number is divided by 0");
        }
    }
}
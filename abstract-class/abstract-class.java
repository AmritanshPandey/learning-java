import java.io.*;
import java.util.*;
abstract class sum {
	abstract int SumOfTwo(int a, int b);
	abstract int SumOfThree(int a, int b, int c);
	void disp(){
		System.out.println("Hello");
	}
}
class demo extends sum {
	int SumOfTwo(int a, int b){
		int total = a + b;
			return total;
	}
	int SumOfThree(int a,int b, int c){
		int totals = a + b + c;
			return totals;
	}
			


	public static void main(String args[ ])
	{
		sum obj = new demo();
		System.out.println(obj.SumOfTwo(5,2));
		System.out.println(obj.SumOfThree(4,5,6));
		obj.disp();
	}
}
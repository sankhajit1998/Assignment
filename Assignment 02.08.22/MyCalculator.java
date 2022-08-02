package practice;
/*
@author Sankhajit Roy
*/
/*
Q. Create a class MyCalculator which consists of a single method long power(int, int). This
method takes two integers, n and p, as parameters and finds n p  . If either n or p is
negative, then the method must throw an exception which says &quot;n or p should not be
negative&quot;. Also, if both  n and p are zero, then the method must throw an exception
which says &quot;n and p should not be zero.&quot;
*/

import java.util.Scanner;

public class MyCalculator {   // class
	public int power(int neg, int pos) throws Exception{   // method which throws exception
		
        if(neg<0 || pos<0)   // condition
            throw new Exception("n and p should be positive");
        
        return (int)Math.pow((long)neg,(long)pos);    // return the calculated power of values
    }
}
class Calculator{   //  main class
	public static void main(String[] args) {   // main method
		Scanner temp = new Scanner(System.in);   // scanner object
		System.out.println("Enter value: ");
		
		// read the given inputs
        int n = temp.nextInt();
        int p = temp.nextInt();

		MyCalculator obj = new MyCalculator();   // object
		
		// try block to check exception or not
        try
        {
            System.out.print("Power of values: "+obj.power(n,p));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}
}
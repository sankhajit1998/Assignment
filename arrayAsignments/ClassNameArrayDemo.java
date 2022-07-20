package arrayAsignments;
/*
@author Sankhajit Roy
*/

// Create a program to find the class name of array.

public class ClassNameArrayDemo {
	public static void main(String[] args) {   // main method
		float veh[] = {10.5f,21.6f,2.07f};   // declaration & initialization of an array
		Class temp = veh.getClass();   // getting the class
		String name = temp.getName();   
		System.out.println("Class Type of this array is "+name);   // print the class name type
	}
}

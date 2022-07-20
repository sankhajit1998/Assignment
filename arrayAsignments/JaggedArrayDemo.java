package arrayAsignments;
/*
@author Sankhajit Roy
*/

// Create a program of jagged array with String value.

public class JaggedArrayDemo {   // class
	public static void main(String[] args) {    // main method
		String arr[][] = {   // declaration & initialization of value
				{"mango","apple","orange"},
				{"potato","tomato"},
				{"rose","tulip","lily","jasmine"}
		};
		System.out.println("Name of the fruit,veg and flowers: ");
		for(String k[] : arr) {    // using for each loop to check elements
			System.out.print("Name: ");
			for(String j :k) {      // using for each loop to check elements
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}

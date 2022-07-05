package assignment_from_sir;

/**
 * @author Sankhajit Roy
**/

// Q.5 - Write a java class to create an array of ten integers than print each of the                    integers value using a for each loop.

public class array_for_eachLoop {

	public static void main(String[] args) {        // main method
		int[] marks = {78,81,91,85,65,85,74,96,69,80};   // array input
		
		for(int grade:marks) {  // using for each loop
			System.out.print(" "+grade);   // print output
		}
		

	}

}

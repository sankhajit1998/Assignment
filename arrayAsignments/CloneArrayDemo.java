package arrayAsignments;
/*
@author Sankhajit Roy
*/

// create a program of clone array and find the sum of all elements.

public class CloneArrayDemo {   // class 
	public static void main(String[] args) {   // main method
		
		int newArray[] = {10,15,20,25};     // declaration
		System.out.print("The actual array: ");
		
		for(int i:newArray)       // for each loop
			System.out.print(i+" ");
		System.out.print("\nThe clone array: ");
		
		int cloneArray[] = newArray.clone();     // took reference variable
		
		for(int i:cloneArray)       // for each loop
			System.out.print(i+" ");
		
		int sum = cloneArray[0];    
		for(int j = 0; j <cloneArray.length;j++)    // for loop for read all elements
			sum += cloneArray[j];      // logic
		System.out.println("\nThe sum of all numbers: "+sum);
	}
}

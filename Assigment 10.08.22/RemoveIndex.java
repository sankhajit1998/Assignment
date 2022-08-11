package practice;
/*
@Author Sankhajit Roy
*/

import java.util.ArrayList;

public class RemoveIndex {   // main class
	public static void main(String[] args) {    // main method
		// crate a array list object
		ArrayList<Integer> arl = new ArrayList<>();
		// add elements
		arl.add(25);
		arl.add(13);
		arl.add(36);
		arl.add(54);
		arl.add(19);
		System.out.println("Elements: "+arl);
		// remove the 3rd element from array list
		System.out.println("Third element: "+arl.remove(2));
		System.out.println("After remove the element: "+arl);
		
	}
}

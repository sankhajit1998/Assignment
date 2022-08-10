package practice;
/*
@Author Sankhajit Roy
*/

// Q2. Write a java program to insert an element into the array list at the first position.

import java.util.ArrayList;

public class InsertArray {   // main class 
	public static void main(String[] args) {   // main method
		
		// creating a ArrayList String type object
		ArrayList<String> al = new ArrayList<>();
		// adding elements
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");
		
		System.out.println("After adding: "+al);
		// adding new element in index '0'
		al.add(0,"Pink");
		System.out.println("Before adding: "+al);
	}
}

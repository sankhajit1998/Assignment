package practice;
/*
@Author Sankhajit Roy
*/
// Q1. Write a java program to iterate all elements in a array list.

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArray {   // main class
	public static void main(String[] args) {  // main method
		
		// creating a ArrayList String type object
		ArrayList<String> al = new ArrayList<>();
		// add elements
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		
		System.out.print("Elements: ");
		Iterator<String> itrl = al.iterator();    // getting the iterator
		while (itrl.hasNext()) {  // checking iterator has element or not
			System.out.print(itrl.next()+" ");  // printing elements & move to next
		}
	}
}

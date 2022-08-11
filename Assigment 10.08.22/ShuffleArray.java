package practice;
/*
@Author Sankhajit Roy
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {   // main class
	public static void main(String[] args) {   // main method
		// String elements in array
		String[] arr = { "red","white","green","blue" };

		// create a array list object
		List<String> arr1 = Arrays.asList(arr);
		System.out.println("Elements: "+arr1);
		// to shuffle the elements under array list
		Collections.shuffle(arr1);    

		System.out.println("After Shuffle: "+Arrays.toString(arr));
	}
}
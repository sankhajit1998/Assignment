/*
@Author Sankhajit Roy
*/

// Find eligibility for donating blood. (age>=25, weight>=48)

package sankha_java;

import java.util.Scanner;    // scanner package

public class blood_doante_eligibility {

	public static void main(String[] args) {    // main method
		
		Scanner input1 = new Scanner(System.in);    // create a scanner object
		System.out.print("Enter your age: ");
		int age = input1.nextInt();     // read 1st user input
		
		Scanner input2 = new Scanner(System.in);    // create a scanner object
		System.out.print("Enter your weight: ");
		int weight = input2.nextInt();  // read 2nd user input
		
		if(age>=25 && weight>=48) {           // 1st condition
			System.out.println("You are eligible for Donating blood.");
		}
		else {                                // last condition
			System.out.println("You are not eligible Donating blood.");
		}

	}

}

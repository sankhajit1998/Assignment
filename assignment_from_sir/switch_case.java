package assignment_from_sir;

/**
 * @author Sankhajit Roy
**/

// Q.6 - Write a java class to accept five string name.

import java.util.Scanner;   // scanner package
public class switch_case {   // class
	
	public static void main(String[] args) {   // main method
		Scanner temp = new Scanner(System.in);    // Scanner object
		System.out.print("Enter the ID: ");
		int id= temp.nextInt();       // read the user input
		
		switch(id) {    // switch case
		case 1 : System.out.println("Switch Case is easy for Arnab.");
		break;
		
		case 2 : System.out.println("Switch Case is easy for Arnab.");
		break;
		
		case 3 : System.out.println("Switch Case is easy for Ranjan.");
		break;
		
		case 4 : System.out.println("Switch Case is easy for Sayan.");
		break;
		
		case 5 : System.out.println("Switch Case is easy for Sankhajit.");
		break;
		
		default: System.out.println("There is no one.");
		
		}

	}

}

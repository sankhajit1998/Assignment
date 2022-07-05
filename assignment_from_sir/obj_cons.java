package assignment_from_sir;

/**
 * @author Sankhajit Roy
**/

// Q.3 - Can you create object of a class from inside from the scope of another class constructor.

public class obj_cons {  // class
	int age = 24;
	public static void main(String[] args) {    // main method
		new new_cons(); // call the constructor
	}
}
class new_cons{   // another class
	new_cons(){   // constructor
		obj_cons a = new obj_cons();   // object
		System.out.println("My age is "+a.age);
	}
}

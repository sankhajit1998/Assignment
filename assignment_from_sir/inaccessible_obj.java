package assignment_from_sir;

/**
 * @author Sankhajit Roy
**/

// Q.2 - Develop a public java class and make sure nobody can create any object of this class from outside the class.

public class inaccessible_obj {   // class
	String name;
	private inaccessible_obj() {    // private constructor
		name = "Sankhajit";
	}

	public static void main(String[] args) {    //  main method
		inaccessible_obj obj = new inaccessible_obj();   // object
		System.out.print("My name is "+obj.name);  // print output

	}

}

//class new_class extends inaccessible_obj{
//	public static void main(String[] args) {
//		inaccessible_obj obj2 = new inaccessible_obj();
//		System.out.print("My given name is "+obj2.name);
//	}
//}

package Assignments;

/*
@author Sankhajit Roy
*/ 

import java.util.Scanner;

public interface LibraryUser {   // parent interface
    void registerAccount();   // abstract method 1
    void requestBook();       // abstract method 2
}


class KidUsers implements LibraryUser{    // child class 1

    public void registerAccount(){
        Scanner temp = new Scanner(System.in);    // Scanner object
        System.out.print("\nEnter Age of Kid User: ");
        int age = temp.nextInt();             // to read user input

        if (age < 12){       // condition
            System.out.println("\nYou have successfully registered under a Kids Account.");
        }
        else {
            System.out.println("\nSorry, Age must be less than 12 to register as a kid.");
        }
    }

    public void requestBook() {
        Scanner temp =  new Scanner(System.in);    // Scanner object
        System.out.print("\nEnter Book Type of Kid User: ");
        String bookType = temp.nextLine();      // to read user input

        if (bookType.equals("Kids")){      // condition
            System.out.println("\nBook Issued successfully, please return the book within 10 days.");
        }
        else {
            System.out.println("\nOops, you are allowed to take only kids books.");
        }
    }
}

class AdultUsers implements LibraryUser{    // child class 2

    public void registerAccount(){
        Scanner temp = new Scanner(System.in);    // Scanner object
        System.out.print("\nEnter age of Adult User: ");
        int age = temp.nextInt();      // to read user input

        if (age > 12){            // condition
            System.out.println("\nYou have successfully registered under an Adult Account");
        }
        else {
            System.out.println("\nSorry, Age must be greater than 12 to register as an adult");
        }
    }

    public void requestBook() {
        Scanner temp =  new Scanner(System.in);    // Scanner object
        System.out.print("\nEnter Book Type of Adult User: ");
        String bookType = temp.nextLine();     // to read user input

        if (bookType.equals("Fiction")){         // condition
            System.out.println("\nBook Issued successfully, please return the book within 7 days");
        }
        else {
            System.out.println("\nOops, you are allowed to take only adult Fiction books");
        }
    }
}


class LibraryInterfaceDemo{       //  main class
    public static void main(String[] args) {      // main method
        LibraryUser obj1 = new KidUsers();        // KidUsers object
        obj1.registerAccount();    // called method (poly)
        obj1.requestBook();        // called method (poly)


        LibraryUser obj2 = new AdultUsers();      // AdultUser object
        obj2.registerAccount();    // called method (poly)
        obj2.requestBook();        // called method (poly)
    }
}
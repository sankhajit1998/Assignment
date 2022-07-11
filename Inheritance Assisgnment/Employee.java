package Assignments;

/*
@author Sankhajit Roy
*/

// Scenario: In a company there are employees with two designations Manager and Trainee. Both employees share the same set of attributes and basic salary calculation logic is same but the basic salary of trainee and manager are different.
//The Manager has a travel allowance equal to 15% of the basic salary, whereas all the other employees the travel allowance is 10% of the basic salary. Write a program to maintain the entities using inheritance.


public class Employee {    // super class
    long employeeId,employeePhone;     // instance variables
    String employeeName,employeeAddress;    // instance variables
    double basicSalary;
    Employee(long id,String name,String address,long phone, double salary){   // constructor parameters
        employeeId = id;
        employeeName = name;
        employeeAddress = address;
        employeePhone = phone;
        basicSalary = salary;
    }
    public double calculateSalary(){      // calculate salary method
        return basicSalary+(basicSalary*250.80/100)+(basicSalary*1000.50/100);     // logic
    }
}

class Manager extends Employee{

    Manager(long id, String name, String address, long phone, double salary) {     // constructor inherit super class

        super(id, name, address, phone, salary);
    }

    public double calculateTransportAllowance(){    // manager travel allowance method
        return 15.0*basicSalary/100;   // logic

    }
}

class Trainee extends Employee{

    Trainee(long id, String name, String address, long phone, double salary) {    // constructor inherit super class
        super(id, name, address, phone, salary);
    }

    public double calculateTransportAllowance(){     // trainee travel allowance method
        return 10.0/100*basicSalary;      // logic

    }
}

class InheritanceActivity{
    public static void main(String[] args) {

        System.out.println("\nMANAGER DETAILS : \n");
        Manager obj1 = new Manager(126534,"Peter","Chennai India",237844,65000);   // object for manager
        System.out.println("ID: "+obj1.employeeId);
        System.out.println("Name: "+obj1.employeeName);
        System.out.println("Address: "+obj1.employeeAddress);
        System.out.println("Phone: "+obj1.employeePhone);
        System.out.println("Basic Salary: "+obj1.basicSalary);
        System.out.println("Salary: "+obj1.calculateSalary());    //  called calculate salary method
        System.out.println("Travel Allowance (15%): "+obj1.calculateTransportAllowance());    // called manager travel allowance method

        System.out.println("\n ----------------------------- \n");


        System.out.println("TRAINEE DETAILS : \n");
        Trainee obj2 = new Trainee(29846,"Jack","Mumbai India",442085,45000);    // object for trainee
        System.out.println("ID: "+obj2.employeeId);
        System.out.println("Name: "+obj2.employeeName);
        System.out.println("Address: "+obj2.employeeAddress);
        System.out.println("Basic Salary: "+obj2.basicSalary);
        System.out.println("Salary: "+obj2.calculateSalary());     //  called calculate salary method
        System.out.println("Travel Allowance (10%): "+obj2.calculateTransportAllowance());   // called trainee travel allowance method

    }
}

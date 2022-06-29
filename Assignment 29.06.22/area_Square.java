/*
@Author Sankhajit Roy
*/
// Parameter of Rectangle


public class area_Square {   // class 1
    int area;
    void insert(int a) {      // method
        area = a;

    }
    void calculateArea() {    //  another method
        System.out.println("The area of square is " + area * area);   // logic
    }
    class area_Square1{   // class 2
        public static void main(String[] args) {   // main method
        	area_Square r1 = new area_Square();    // object
            r1.insert(5);                // insert the value
            r1.calculateArea(); 
        }
    }
}
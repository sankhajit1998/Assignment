/*
@Author Sankhajit Roy
*/
// Parameter of Rectangle


public class parameter_Rectangle {  // class 1
    int length;
    int width;
    void insert(int l, int w) {   // method
        length = l;
        width = w;

    }
    void calculateArea() {   // another method
        System.out.println("The paramter of rectangle is "+2*(length + width));  // logic
    }
    class parameter_Rectangle1{    // class 2
        public static void main(String[] args) {   // main method
            parameter_Rectangle r1 = new parameter_Rectangle();  // object 
            r1.insert(10,5);    // insert the value
            r1.calculateArea();    // call the 2nd method
            
        }
    }
}
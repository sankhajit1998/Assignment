/*
@Author Sankhajit Roy
*/
// Area of Rectangle

public class rectangl_Area { // class 1
    int length;
    int width;
    void insert(int l, int w) {   // method
        length = l;
        width = w;

    }
    void calculateArea() {   // another method
        System.out.println("The area of this rectangle is "+length * width);   // logic
    }
    static class rectangle_Area1{   // class 2
        public static void main(String[] args) {   // main method
            rectangl_Area r1 = new rectangl_Area();   // object 1
            rectangl_Area r2 = new rectangl_Area();   // object 2
            r1.insert(11,5);       // insert 1st value
            r2.insert(3,15);       // insert 2nd value
            r1.calculateArea();     
            r2.calculateArea();
        }
    }
}



package day47;

public class ShapeTest {


    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 20);
        System.out.println("before r1 = " + r1);
        r1.calculateArea();
        System.out.println("after r1 = " + r1);

        Triangle t1 = new Triangle(7, 11);
        System.out.println("before area calculation " + t1);
        t1.calculateArea();
        System.out.println("after area calculation = " + t1);


    }


}


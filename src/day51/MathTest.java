package day51;

public class MathTest {

    public static void main(String[] args) {

        Addition q1 = new Addition(10, 90);
        System.out.println("q1 before calc : " + q1);
        q1.calculate();
        System.out.println("q1 after  calc : " + q1);

        Subtraction q2 = new Subtraction(90, 10);
        System.out.println("q2 = " + q2);
        q2.calculate();
        System.out.println("q2 = " + q2);

        Subtraction q3 = new Subtraction(10, 90);
        System.out.println("q3 = " + q3);
        q2.calculate();
        System.out.println("q3 = " + q3);
    }
}

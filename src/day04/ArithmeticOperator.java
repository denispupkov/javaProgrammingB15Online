package day04;

public class ArithmeticOperator {

    public static void main(String[] args) {
//  arithmetic operator between two int -> another int
      //  System.out.println(5+3);
       // System.out.println(5-3);
       // System.out.println(5*3);
      //  System.out.println(5/3);

// the final result will be larger data type
       // System.out.println( 5+3.0d );
       //System.out.println( 5-3.0d );
      //  System.out.println( 5*3.0d );
      //  System.out.println( 5/3.0f );

        int num1=5;
        double num2=3.0d;
        float num3=3.0f;

        double a = num1+num2;
        double b = num1-num2;
        double c = num1*num2;
        double d = num1/num2;
        float e = num1/num3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}

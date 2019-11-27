package day11;

public class LogicalOperators {

    public static void main(String[] args) {
        // && 2 ampersand & 1 ampersand ---> logical operator
        // x>60 && x <100 ; means AND
       //---------------------------------------------------
        // single pipe | or || double pipe  means OR
        // int x=70; x>10 || x<5;

        System.out.println("Truth Table for &&");
        System.out.println("result of true && true is "+ (true && true)); //AND
        System.out.println("result of true && false is "+ (true && false));
        System.out.println("result of true && true is "+ (false && true));
        System.out.println("result of true && true is "+ (false && false));

        System.out.println("Truth Table for ||");
        System.out.println("result of true || true is "+ (true || true)); //OR
        System.out.println("result of true || false is "+ (true || false));
        System.out.println("result of true || true is "+ (false || true));
        System.out.println("result of true || true is "+ (false || false));

        int num=55;
        System.out.println(num>100 || num<10);
        System.out.println(num>10 && num<60);


        System.out.println(true || false || false);
        System.out.println(true & false & false);

        System.out.println(num>50 && num != 52 || num==57);  //checking num is more than 50 and num
        // not equal to 52 or num equal to 57
    }
}

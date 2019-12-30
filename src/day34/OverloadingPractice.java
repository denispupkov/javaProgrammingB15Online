package day34;

public class OverloadingPractice {

    public static void main(String[] args) {

        addMethod(140);
        addMethod(111,222);
        addMethod(10,20,33);
        addMethod(15L,30L);
    }
    public static void addMethod(int add) {

        System.out.println(add+ 100+"add 100 to number ");

    }





    public static void addMethod(int add1, int add2) {

       // System.out.println(addMethod,100);
         System.out.println(+add1+add2+" num1+num2");

    }




public static void addMethod(int add1, int add2, int add3) {

    System.out.println(+add1+add2+add3+" num1+num2+num3 ");
        }





public static void addMethod(long add1, long add2) {

    System.out.println(+add1+add2+" long1 + long2 ");
        }

}

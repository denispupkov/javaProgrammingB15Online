package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {

        String name = giveMeMyName();
        System.out.println("name = " + name);

        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);

        System.out.println("result of doubleing 100 is " + doubleTheNumber(100));

        int add14to16Result = add2Numbers(14, 16);
        System.out.println("add14to16Result = " + add14to16Result);
        System.out.println(add2Numbers(14, 16) + 5);


    }

    public static String giveMeMyName() {
        return "Dennis";


    }

    public static int doubleTheNumber(int num) {

        //  System.out.println("I am going to double the value of "+num);
        int result = num * 2;
        return result;
    }

    public static int add2Numbers(int num1, int num2) {


        return num1 + num2;
    }


}

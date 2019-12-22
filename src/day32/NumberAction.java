package day32;

public class NumberAction {

    public static void main(String[] args) {

        NumberComparison(23, 23);


    }

    public static void NumberComparison(int num1, int num2) {

        if (num1 > num2) {

            System.out.println(num1 + " more than " + num2);
        } else if (num2 > num1) {

            System.out.println(num2 + " more than " + num1);
        } else if (num1 == num2) {

            System.out.println(num1 + " and " + num2 + " are equal");
        }
    }


}

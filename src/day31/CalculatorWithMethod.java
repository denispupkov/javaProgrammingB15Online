package day31;

public class CalculatorWithMethod {

    public static void main(String[] args) {

        add(6, 23);
        substract(66, 30);
        multiply(12, 5);
        divide(200, 20);

    }

    public static void add(int num1, int num2) {

        System.out.println(num1 + num2);

    }

    public static void substract(int num1, int num2) {

        System.out.println(num1 - num2);

    }

    public static void multiply(int num1, int num2) {

        System.out.println(num1 * num2);

    }

    public static void divide(int num1, int num2) {

        System.out.println(num1 / num2);

    }
}

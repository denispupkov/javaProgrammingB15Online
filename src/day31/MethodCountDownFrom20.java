package day31;

public class MethodCountDownFrom20 {

    public static void main(String[] args) {

        countDownFrom20();
        oddNumbersFrom1To100();
    }

    public static void countDownFrom20() {
        for (int i = 20; i >= 1; i--) {

            System.out.print(i + " ");


        }
        System.out.println();
    }

    public static void oddNumbersFrom1To100() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {

                System.out.print(i + " ");
            }

        }

    }
}
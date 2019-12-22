package day32;

public class skipCountBy3From0to50 {

    public static void main(String[] args) {

        countBy3from0To50();
        countDownByEvenNumberFrom50to0();
        print1toX(6);
    }

    public static void countBy3from0To50() {

        for (int i = 0; i <= 50; i += 3) {

            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void countDownByEvenNumberFrom50to0() {

        for (int i = 50; i >= 0; i -= 2) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    public static void print1toX(int x) {


        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
    }


}

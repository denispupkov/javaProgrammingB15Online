package day20;

public class WarmUpSumOfAdd {
    public static void main(String[] args) {

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 10; i <= 100; i++) {


            if (i % 2 == 1) {

                sumOdd = sumOdd + i;
                //System.out.println(sumOdd);

            } else {
                sumEven = sumEven + i;
                //System.out.println(sumEven);

            }
        }

        System.out.println("SUM OF EVEN NUMBERS - " + sumEven);
        System.out.println("SUM OF ODD NUMBERS - " + sumOdd);
    }
}

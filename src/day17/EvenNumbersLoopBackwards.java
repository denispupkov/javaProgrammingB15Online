package day17;

public class EvenNumbersLoopBackwards {

    public static void main(String[] args) {

        int evenNumber = 100;

        while (evenNumber > 0) {

            if (evenNumber % 2 == 0) {

                System.out.println(evenNumber + " ");

            }
            --evenNumber;
        }

    }


}

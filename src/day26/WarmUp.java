package day26;

public class WarmUp {
    public static void main(String[] args) {

        int[] myNumber = {10, 40, 30, 7};

        myNumber[1] = myNumber[1] + 1;

        myNumber[1] = myNumber[1] * 2;

        for (int i = 0; i < myNumber.length; i++) {

            //System.out.println(myNumber[i]);

        }
        myNumber[2] = myNumber[0] + myNumber[1];

        for (int i = 0; i < myNumber.length; i++) {


            System.out.println(myNumber[i]);
        }


        int swap = 0;

        swap = myNumber[3];
        myNumber[3] = myNumber[0];
        myNumber[0] = swap;

        for (int i = 0; i < myNumber.length; i++) {

            System.out.println("swapped value is " + myNumber[i]);

        }


    }


}

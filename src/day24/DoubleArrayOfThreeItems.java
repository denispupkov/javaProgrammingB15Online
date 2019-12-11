package day24;

import java.util.Arrays;

public class DoubleArrayOfThreeItems {
    public static void main(String[] args) {


        double[] prices = {12.99, 10.50, 90.55};
        String pricesString = Arrays.toString(prices);

        System.out.println(pricesString);


        for (int i = 1; i < pricesString.length() - 1; i++) {


            System.out.print(pricesString.charAt(i));
            //System.out.println(pricesString.charAt(1));

        }
    }

}

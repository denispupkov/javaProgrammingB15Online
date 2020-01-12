package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPracticeShortWay {

    public static void main(String[] args) {

        // create 6 doubles in short way but we will not able to add or remove items

        List<Double> prices = Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99, 65.67);
        System.out.println("prices = " + prices);
        // prices.add(12.8); cannot add or remove items with asList method
        //prices.remove(0);

        int count = 0;
        for (Double each : prices) {
            if (each > 5) {
                ++count;
            }
        }
        System.out.println("count = " + count);

        // I want to add 2 more prices (does not have to be same list)

        ArrayList<Double> newPrices = new ArrayList<>(prices);

        newPrices.add(199.99);
        newPrices.remove(0.99);

        System.out.println("newPrices = " + newPrices);

//create a ArrayList object in one shot with many items and we can add or remove items

        //just one option to create ArrayList Object in one shot
        ArrayList<Double> oneShotPrice = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99));//now we CAN MODIFY!!!

        System.out.println("oneShotPrice before = " + oneShotPrice);
        // add 100.99 after 9.99
        oneShotPrice.add(1, 100.99);
        System.out.println("oneShotPrice after adding = " + oneShotPrice);
        // remove item 3
        oneShotPrice.remove(2);
        System.out.println("oneShotPrice after removing = " + oneShotPrice);


    }
}

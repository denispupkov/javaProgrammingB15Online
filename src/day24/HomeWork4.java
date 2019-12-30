package day24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] itemPrices = {1.99F, 0.99F, 4.65F, 3.89F, 3.88F, 2.88F};
        String allItems="";

        for (int i = 0; i <= groceryItems[i].length(); i++) {

            System.out.println(groceryItems[i].substring(groceryItems[i].length() - 3));


            {
            }
        }
            allItems=Arrays.toString(groceryItems);
            System.out.println(allItems);


        for (int i = 0; i <itemPrices.length ; i++) {

            if (i%2==0) {
                System.out.println("All prices with even index " + itemPrices[i]);
            }
        }

        for (int x = 0; x < itemPrices.length; x++) {

            if (itemPrices[x]<3) {

                System.out.println("Items with price less than 3 dollar "+itemPrices[x]);
            }
        }


    }
}
package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceList {

    public static void main(String[] args) {

        List<Double> priceList = new ArrayList<>(); // another way
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);
        
        System.out.println("priceList = " + priceList);
        priceList.set(2,10.0);
        System.out.println("changed third item price = " + priceList);
        //add 4 dollar to 1 price
    priceList.set(0, priceList.get(0)+4);
        System.out.println("4 dollar added to 1st item = " + priceList);

        //change last price to sum of first and second item
        double sumOfFirstItem = priceList.get(0)+priceList.get(1);

        priceList.set(priceList.size()-1, sumOfFirstItem);

        System.out.println("New price list = " + sumOfFirstItem);

        //40% off

        priceList.set(1, priceList.get(1)*0.6);
        System.out.println("40% off second item= " + priceList.get(1));

        //double the value of each

        for (int i = 0; i <priceList.size() ; i++) {


           // priceList.set(i, priceList.get(i) * 2); first way
       double newVal =priceList.get(i)*2; //second way
       priceList.set(i, newVal);
        }
        System.out.println("priceList after Doubling = " + priceList);

        for (int i = 0; i <priceList.size() ; i++) {

            double eachPrice=priceList.get(i);
            if (eachPrice>20) {
                priceList.set(i, eachPrice/2);
            }


        }
        System.out.println("priceList after cutting half the price " + priceList);
   //swap the first and last value

        int lastIndex = priceList.size()-1;
Double temp =priceList.get(0);
priceList.set(0, priceList.get(lastIndex));
priceList.set(lastIndex,temp);
        System.out.println("priceList SWAPPED = " + priceList);

    }
}

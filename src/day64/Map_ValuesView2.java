package day64;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_ValuesView2 {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        Collection<Double> allPrices = groceryPriceMap.values();

        //remove all entry of the groceryMap if the price value is more than 3

        allPrices.removeIf(eachPrice -> eachPrice > 3); //1 way to remove item!!!
        System.out.println("groceryPriceMap = " + groceryPriceMap);


        Iterator<Double> itr = allPrices.iterator();//2 way to remove item!!!!
        while (itr.hasNext()) {
            if (itr.next() > 2) {
                itr.remove();
            }
        }
        System.out.println("allPrices = " + allPrices);

    }
}

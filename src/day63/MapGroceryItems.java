package day63;

import java.util.HashMap;
import java.util.Map;

public class MapGroceryItems {
    public static void main(String[] args) {


        Map<String, Double> itemAndPrice = new HashMap<>();
        itemAndPrice.put("Banana", 0.99);
        itemAndPrice.put("Apple", 1.99);
        itemAndPrice.put("Meat", 7.99);
        itemAndPrice.put("Milk", 3.99);
        itemAndPrice.put("Bread", 2.50);
        itemAndPrice.put("Potato", 1.49);
        itemAndPrice.put("Potato", 1.00);
        itemAndPrice.put("Tomato", 2.35);
        itemAndPrice.put("Tomato", 3.35);
        System.out.println("itemAndPrice = " + itemAndPrice);
        itemAndPrice.putIfAbsent("Meat", 8.99);
        itemAndPrice.putIfAbsent("Eggs", 2.77);
        System.out.println("itemAndPrice = " + itemAndPrice);
        System.out.println(itemAndPrice.get("Tomato"));
        System.out.println("itemAndPrice.size() = " + itemAndPrice.size());
        System.out.println("itemAndPrice.replace(\"Apple\",1.99*2) = " + itemAndPrice.replace("Apple", 1.99 * 2));
        System.out.println("itemAndPrice = " + itemAndPrice);
        double newPrice = itemAndPrice.get("Apple") * 2;
        itemAndPrice.replace("Apple", newPrice);
        System.out.println("itemAndPrice = " + itemAndPrice.get("Apple"));

        if (itemAndPrice.containsKey("Tomato")) {
            itemAndPrice.remove("Tomato");
            System.out.println("NO MORE TOMATO");
        }
        System.out.println("itemAndPrice = " + itemAndPrice);


    }
}

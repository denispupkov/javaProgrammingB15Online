package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapContinue {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        //map view: keyset view (only key), values view (only value), entryset view(both)

        Set<String> allNames = groceryPriceMap.keySet();
        System.out.println("allNames = " + allNames);

        //keySet view of Map strictly connected to Map!!!!!
        //if you remove certain item it removes it from Map as well !!!!

        allNames.remove("Tomato");
        System.out.println("No Tomato = " + allNames);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

//TO BREAK THIS TIE WE HAVE TO CREATE COPY OF SET AND THEN WE CAN DELETE ANY ITEM WITHOUT REFLECTING ACTUAL SET
        Set<String> namesCopy = new HashSet<>(allNames);
        System.out.println("namesCopy = " + namesCopy);

        namesCopy.remove("Grape");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

    }
}

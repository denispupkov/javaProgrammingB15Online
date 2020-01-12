package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {

    public static void main(String[] args) {


        List<String> groceries = Arrays.asList("eggs", "milk", "butter", "apple", "salmon");
        System.out.println("groceries = " + groceries);
        ArrayList<String> newList = new ArrayList<>(groceries);

        newList.add("diet Coke");
        newList.add("Sugar");

        System.out.println("newList = " + newList);

        //new items to add to existing list
        List<String> newItemsToAdd = Arrays.asList("Pasta", "Branzini", "asparagus", "spinach");

        //adding 1 list to another list
        //we want to add all items inside newItemstoadd to newList

        newList.addAll(newItemsToAdd);
        System.out.println("newList with all items from two lists = " + newList);

    }
}
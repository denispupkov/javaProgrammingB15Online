package day38;

import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        System.out.println("nums before sort = " + nums);
        //2 ways to sort an arrayList Object
        // use Collections utility class

        Collections.sort(nums); // SORT ARRAYLIST
        System.out.println("after sort = " + nums);

        Collections.sort(nums, Comparator.reverseOrder()); //SORT WITH REVERSE ORDER

        System.out.println("nums sort with reverse order = " + nums);

        //Comparator.naturalOrder() --> from low to high
        //Comparator.reverseOrder() --> from high to low

        nums.sort(Comparator.naturalOrder());
        System.out.println("nums after using nums.sort natural order = " + nums);

        nums.sort(Comparator.reverseOrder());
        System.out.println("nums after using nums.sort reverse order = " + nums);


    }
}

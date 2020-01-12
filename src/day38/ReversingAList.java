package day38;

import java.util.*;

public class ReversingAList {

    public static void main(String[] args) {

        //reversing an ArraysList object


        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200, 100, 700, 400, 500));
        System.out.println("nums1 before reversing = " + nums1);
        Collections.reverse(nums1);
        System.out.println("nums1 after reversing = " + nums1);

        Collections.sort(nums1, Comparator.reverseOrder());
        System.out.println("nums1 after Comparator.reverseOrder = " + nums1);


    }


}

package day36;

import java.util.ArrayList;

public class FindingUniqueUsingArrayList {

    public static void main(String[] args) {

        int[] nums = {11,33,44,11,33,44,22,22,55,44,33};

        ArrayList<Integer> uniqueList = new ArrayList<>();

        //add items to uniqueList if it doe not already contains that item

        for (int each:nums) {
        uniqueList.add(each);
            System.out.println("each = " + each);

        }
        System.out.println("uniqueList = " + uniqueList);
    }

}

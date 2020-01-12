package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllPractice {

    public static void main(String[] args) {


        ArrayList<Integer> num1 = new ArrayList<>();

        num1.add(100);
        num1.add(200);
        num1.add(300);
        num1.add(400);
        num1.add(500);
        num1.add(600);
        System.out.println("husband list = " + num1);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));
        System.out.println("wifes list = " + nums2);

        num1.retainAll(nums2); //KEEP EVERYTHING FROM BOTH LISTS THATS IN COMMON

        System.out.println("num1 ITEMS IN COMMON = " + num1);
        //System.out.println("nums2 = " + nums2);

        System.out.println("does num1 has the same elements as nums2 = " + num1.equals(nums2));


    }
}

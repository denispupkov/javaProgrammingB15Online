package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i++) {

            System.out.println("is " + nums[i] + " less than " + nums[i + 1] + " ?  " + (nums[i] < nums[i + 1]));

            if (!(nums[i] < nums[i + 1])) {
                System.out.println("ARRAY IS NOT SORTED, NO POINT CHECKING THE REST");
                break;
            }

        }


    }
}

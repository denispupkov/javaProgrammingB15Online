package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 4, 5, 6};

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        int numsItemCount = nums.length;

        int[] numsCopy = new int[numsItemCount];
//        numsCopy[0]=nums [0];
//        numsCopy[1]=nums [1];
//        numsCopy[2]=nums [2];
//        numsCopy[3]=nums [3];
//        numsCopy[4]=nums [4];
//        numsCopy[5]=nums [5];

        for (int i = 0; i < numsItemCount; i++) {

            numsCopy[i] = nums[i];

        }
        System.out.println("Before sorting numsCopy = " + Arrays.toString(numsCopy));


        Arrays.sort(numsCopy);
        System.out.println("After sorting Arrays.toString(numsCopy) = " + Arrays.toString(numsCopy));

        if (Arrays.equals(nums, numsCopy)) {

            System.out.println("THIS ARRAY IS ALREADY SORTED");
        } else {

            System.out.println("THIS ARRAY IS NOT SORTED");
        }
    }
}

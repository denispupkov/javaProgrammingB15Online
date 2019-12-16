package day27;

public class ArraysTask02 {

    public static void main(String[] args) {


        int[] nums = {100, 10000, 9999, 8888, 1231, 2345};

        int maxNum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (maxNum < nums[i]) {
                maxNum = nums[i];
            }
        }
        System.out.println("first maxNum = " + maxNum);


        int secondMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (secondMax < nums[i] && nums[i] != maxNum) {
                secondMax = nums[i];

            }

        }
        System.out.println("secondMax = " + secondMax);
    }
}

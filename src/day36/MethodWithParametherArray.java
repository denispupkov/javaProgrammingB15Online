package day36;

import java.util.Arrays;

public class MethodWithParametherArray {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,7,2};
        System.out.println("nums before sort = " + Arrays.toString(nums));
        Arrays.sort(nums);

        System.out.println("Arrays.toString(nums = " + Arrays.toString(nums));
        changeArrayFirstItemTo100(nums);
        System.out.println("nums = " + Arrays.toString(nums));
    }

public static void changeArrayFirstItemTo100 (int[] numbers) {
        numbers[0]=100;
}

}

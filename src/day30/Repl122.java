package day30;

import java.util.Arrays;
import java.util.Scanner;

public class Repl122 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
        //        input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int[] nums = {1, 2, 3, 4, 1, 2, 3};
        int count = 0;
        int number = 0;
        Arrays.sort(nums);

        for (int i = 0; i < 6; i += 2) {

            if (nums[i] != nums[i + 1]) {
                number = nums[i];
                break;
            }
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
        if (count == 3) {
            System.out.println(nums[6]);
        } else {
            System.out.println(number);
        }


    }

}










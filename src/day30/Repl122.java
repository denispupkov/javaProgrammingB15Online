package day30;

import java.util.Scanner;

public class Repl122 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
        //        input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int[] nums = {1, 2, 3, 4, 3, 2, 4};

        int count = 0;
        int number = 0;
        int pair = 0;         // USE SORT ARRAYS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (nums[i] == nums[j]) {
                    number = nums[j];
                }

            }

            System.out.print(nums[number]);

        }

    }
}








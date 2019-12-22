package day24;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below
        int count = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }

            }
        }

    }

}





package day31;

import java.util.Scanner;

public class Repl159 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

        for (int i = 0; i < nums.length; i++) {
            int dublicate = 0;
            for (int j = 0; j < nums.length; j++) {

                if (i != j && nums[i] == nums[j]) {
                    dublicate++;
                    break;
                }

            }
            if (dublicate == 0) {
                System.out.println(nums[i]);
            }

        }

    }
}
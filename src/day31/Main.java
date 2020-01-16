package day31;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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

        int size = nums.length - 2;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != nums[i + 1] && i != size) {

                System.out.println("i = " + nums[i]);
            } else if (nums[i] != nums[i + 1] && i == size && (i - 2) != (i - 1)) {

                System.out.println("i = " + nums[i + 1]);
            } else if (nums[i] != nums[i + 1] && i == size && (i - 2) == (i - 1)) {

                System.out.println("i = " + nums[i]);

            } else if (nums[i] != nums[i + 1] && i == size) {


                System.out.println("i = " + nums[i]);
                System.out.println("i = " + nums[i + 1]);
            } else if (nums[i] == nums[i + 1] && i != size - 1) { //&& ((size-1)-i)>1
                i = i + 1;
            }

        }


    }
}
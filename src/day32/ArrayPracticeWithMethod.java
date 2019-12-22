package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {

        printArrayItems(new int[]{1, 6, 5, 3, 12, 3});//this is passing the array directly into the method

        int[] scores = {2, 5, 8, 23, 4, 5, 6}; //this is assigning the array object into a variable and then passing into the method
        printArrayItems(scores);
        printMaxOfInArray(scores);
        printMinOfIntArray(scores);
        printSumOfIntArray(scores);

        compare2ArraySize(new String[]{"Sezgin", "Senay", "Astrit"}, new String[]{"Araz"});
        String[] names1 = {"Superman", "Batman", "Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};

        compare2ArraySize(names1, names2);


    }

    public static void printArrayItems(int[] nums) {

        System.out.println("Arrays has items: " + Arrays.toString(nums));


    }

    public static void printMaxOfInArray(int[] nums) {

        int[] ArraysNumbers = new int[6];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (max < nums[i]) {
                max = nums[i];

            }

        }

        System.out.print("max is " + max);
        System.out.println();
    }

    public static void printMinOfIntArray(int[] nums) {

        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];

            }

        }

        System.out.print("min is " + min);
        System.out.println();

    }

    public static void printSumOfIntArray(int[] nums) {

        int sum = 0;
        for (int each : nums) {
            sum = sum + each;  //sum+=each ;
        }
        System.out.println("sum = " + sum);
    }

    public static void compare2ArraySize(String[] arr1, String[] arr2) {
        if (arr1.length > arr2.length) {
            System.out.println("Array 1 has more items");
        } else if (arr1.length < arr2.length) {
            System.out.println("array 2 has more items");
        } else {
            System.out.println("two arrays are equal");
        }

    }
}






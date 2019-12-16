package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {


            System.out.println("Enter an int number");
            int input = scan.nextInt();
            numbers[i] = input;
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        int largestNumber = numbers[numbers.length - 1];
        System.out.println("largestNumber = " + largestNumber);
        int smallestNumber = numbers[0];
        System.out.println("smallestNumber = " + smallestNumber);


    }
}

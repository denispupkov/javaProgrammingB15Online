package day06;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        int myNumber =10;
        int yourNumber =11;

        System.out.println("myNumber Remainder of dividing 2 :" +myNumber%2);
        System.out.println("myNumber Remainder of dividing 2 :" +yourNumber%2);
        System.out.println("Adding my number to your number :" +yourNumber+myNumber); //not calculated correctly
        System.out.println("Adding my number to your number :" +(yourNumber+myNumber)); // calculated correctly with parentheses
    }
}

package day25;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {


        String name = "Anastasia";

        char[] allCharsInName = name.toCharArray(); //method stores string to char array with foreach loop

        for (char eachChar : allCharsInName) {

            System.out.println("eachChar = " + eachChar);
        }


        int count = 0;
        for (char eachChar : allCharsInName) {

            if (eachChar == 'a') {

                ++count;
            }
            // System.out.println("count = " + count);


        }

        System.out.println("count = " + count);

        Arrays.sort(allCharsInName);
        System.out.println("AFTER SORTING allCharsInName = " + Arrays.toString(allCharsInName));
    }
}
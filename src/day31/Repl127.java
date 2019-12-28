package day31;

import java.util.Arrays;
import java.util.Scanner;

public class Repl127 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int[] emptyArray = new int[8];
        int dayCounter = 1;

        System.out.print("Day " + dayCounter + " ");
        System.out.println(Arrays.toString(inhabitants));

        for (int x = 0; x < inhabitants.length; x++) {
            dayCounter += 1;
            System.out.print("Day " + dayCounter + " ");
            for (int i = 0; i < inhabitants.length; i++) {

                inhabitants[i] = inhabitants[i] / 2;

            }

            System.out.println(Arrays.toString(inhabitants));

            if (Arrays.equals(inhabitants, emptyArray)) {
                break;
            }


        }

    }
}

package day31;

import java.util.Scanner;

class Repl152 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static int[] plus_minus(int[] arr) {
        int[] result = new int[3];
        //result [0]=0;
        //result [1]=0;
        //result [2]=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                result[0]++;

            } else if (arr[i] < 0) {
                result[1]++;
            } else if (arr[i] == 0) {
                result[2]++;
            }

        }
        System.out.println("positives: " + result[0]);
        System.out.println("negatives: " + result[1]);
        System.out.println("zeros: " + result[2]);

        return result;
    }

}
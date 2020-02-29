package day64;

public class Mentoring2 {

    public static void main(String[] args) {

        //Write a code to find the second highest number in this array
        int[] arr = {1, 2, 5, 3, 8, 7, 9, 4};

        int highest = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

        int secondHighest = highest - 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == secondHighest) {
                secondHighest = arr[i];
                break;
            } else if (arr[i] != secondHighest) {
                continue;
            }
            secondHighest--;
        }

        System.out.println("secondHighest = " + secondHighest);
        System.out.println("highest = " + highest);
    }
}

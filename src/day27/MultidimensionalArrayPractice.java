package day27;

import java.util.Arrays;

public class MultidimensionalArrayPractice {

    public static void main(String[] args) {

        String[][] names = {{"name1", "name2"}, {"name3", "name4"}};

        System.out.println(names[1][0]);

        names[1][1] = "name!!!";


        System.out.println(Arrays.toString(names[1]));

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
            //System.out.println(Arrays.toString(numbers[i]));
        }


        System.out.println(Arrays.deepToString(numbers));

        int[][] ages = {{10}, {12, 13, 14, 15, 16, 17}, {19, 20, 21, 22, 23}};

        for (int i = 0; i < ages.length; i++) { //check the length of entire 2d array
            for (int j = 0; j < ages[i].length; j++) { //check the length every single element of 2d array

                if (ages[i][j] % 2 != 0) { //continue skips all odd numbers
                    continue;

                }
                System.out.print(ages[i][j] + " ");
                System.out.println();
            }
        }

        int[] arr1D = {1, 2, 3};

        for (int each : arr1D) {

            System.out.print(each + " ");
        }

        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80, 90, 199}};

        for (int[] each1DArray : arr2D) {

            for (int eachElement : each1DArray) {
                System.out.print(eachElement);
            }

        }
    }
}
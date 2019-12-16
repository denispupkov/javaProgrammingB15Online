package day27;

import java.util.Arrays;

public class MultiDimentionalArray3D {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        System.out.println(arr3D[1][0][2]); //9
        System.out.println(arr3D[0][0][1]); //2
        System.out.println(Arrays.toString(arr3D[0][0])); //1,2,3
        System.out.println(Arrays.toString(arr3D[1][1])); // 10,11,12
        System.out.println(Arrays.deepToString(arr3D[1])); // 7,8,9,10,11,12

        System.out.println(Arrays.deepToString(arr3D));//1,2,3,4,5,6,7,8,9,10,11,12

        for (int i = 0; i < arr3D.length; i++) { //each index 2d array
            for (int j = 0; j < arr3D[i].length; j++) { //each index 1d array
                for (int k = 0; k < arr3D[i][j].length; k++) { //each index of the values

                    System.out.print(arr3D[i][j][k] + " ");

                }
            }

        }


    }
}

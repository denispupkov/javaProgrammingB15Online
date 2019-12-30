package day27;

import java.util.Arrays;

public class MultidimentionalArray3DHomeWork {

    public static void main(String[] args) {

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        /* for (int i = 0; i < arr3D.length; i++) { //each index 2d array
            for (int j = 0; j < arr3D[i].length; j++) { //each index 1d array
                for (int k = 0; k < arr3D[i][j].length; k++) { //each index of the values

                    System.out.print(arr3D[i][j][k] + " "); */
            for (int [][] each: arr3D) {
                for (int [] each2D: each) {

                }
            }


                }
}

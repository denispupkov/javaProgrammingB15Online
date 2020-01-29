package day48;

import java.util.Arrays;

public class Repl190 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int length = a.length + b.length;
        int[] result = new int[length];
        int pos = 0;
        for (int element : a) {
            result[pos] = element;
            pos++;
        }
        for (int element : b) {
            result[pos] = element;
            pos++;
        }
        System.out.println("result = " + Arrays.toString(result));

    }
}

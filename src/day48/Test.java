package day48;

public class Test {
    public static int[] mergeStrings(int[] a, int[] b) {

        //int[] a={1,2,3};
        //int[] b={4,5,6};


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

        return result;
    }

    public static void main(String[] args) {
        int[] c = {7, 8, 9};
        int[] d = {10, 11, 12};

        mergeStrings(c, d);
    }

}

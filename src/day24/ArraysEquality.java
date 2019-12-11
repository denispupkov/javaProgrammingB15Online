package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {

        int[] scores1 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores2 = {22, 45, 6, 37, 3, 6, 9};
        int[] scores3 = {2, 5, 6, 7, 3, 34, 6};


        System.out.println(scores1 == scores2); //DON'T USE IT FOR ARRAYS EQUALIYU
        System.out.println(scores1 == scores3); //DON'T USE THIS FOR ARRAYS EQUALITY

        boolean scoreResult1 = Arrays.equals(scores1, scores2);
        System.out.println("is s1 and s2 is equal? " + scoreResult1);

        boolean scoreResult2 = Arrays.equals(scores1, scores3);
        System.out.println("is s1 and s3 is equal? " + scoreResult2);


    }
}

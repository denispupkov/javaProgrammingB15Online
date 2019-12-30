package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {

        String sentence ="I Love Java";

        char[] eachChars = sentence.toCharArray();
        String[] eachWords = sentence.split("  ");

        int[] resultArr=returnBoysAndGirlsResult();
        System.out.println(Arrays.toString(resultArr));
    }

public static int[] returnBoysAndGirlsResult() {

        int[] boysGirlsCount = {56,52};

        return boysGirlsCount;
}
}

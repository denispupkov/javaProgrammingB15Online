package day29;

import java.util.Arrays;

public class FillingUpArrayValueWithEvenNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[100];

        System.out.println(Arrays.toString(numbers));

//        numbers[0]=1;
//        numbers[1]=2;
//        numbers[2]=3;

        for (int i = 0; i < numbers.length; i++) {


            numbers[i] = i * 2;
            System.out.print(numbers[i] + " ");
        }


    }
}


package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {

// to printing the content
        //toString ----> Arrays.toString(yourArrayHere)
        // Arrays.sort(yourArrayHere
        // Arrays.equals(firstArray,secondArray)

        String[] superHero = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};

        System.out.println(Arrays.toString(superHero));

        String savingSuperHerosAsString = Arrays.toString(superHero);

        System.out.println(savingSuperHerosAsString.charAt(0));

        int[] numbers = {10, 44, 55, 3, 78};

        System.out.println(Arrays.toString(numbers));

    }
}

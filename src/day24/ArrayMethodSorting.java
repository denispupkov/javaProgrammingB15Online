package day24;

import java.util.Arrays;

public class ArrayMethodSorting {

    public static void main(String[] args) {

        int[] scores = {99, 44, 66, 23, 19, 55};

        System.out.println("not sorted " + Arrays.toString(scores));

        Arrays.sort(scores);

        System.out.println("sorted " + Arrays.toString(scores));

        System.out.println("the new first Item Value is " + scores[0]);


        char[] nameChars = {'G', ' ', 'd', 'Z', '9', 'A'};

        System.out.println("not sorted " + Arrays.toString(nameChars));

        Arrays.sort(nameChars);

        System.out.println("sorted " + Arrays.toString(nameChars));

        String[] superHero = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        System.out.println("not sorted " + Arrays.toString(superHero));
        Arrays.sort(superHero);
        System.out.println("sorted " + Arrays.toString((superHero)));

        //SORT METHOD DOES NOT WORK FOR BOOLEAN
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println("NOT SORTED " + Arrays.toString(fiveSwitchOnOffs));
        //Arrays.sort(fiveSwitchOnOffs);
    }
}

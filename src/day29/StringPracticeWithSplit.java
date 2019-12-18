package day29;

import java.util.Arrays;

public class StringPracticeWithSplit {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";

        //hero code is superman and identity is Clark Kent
        //the initials of the Hero is CK
        String[] splitted = hero1.split("-");

        System.out.println(Arrays.toString(splitted));

        System.out.println(splitted[0].charAt(0) + "" + splitted[1].charAt(0));
        System.out.println(splitted[1].charAt(0) + "" + splitted[1].substring(splitted[1].indexOf(" ") + 1, splitted[1].indexOf(" ") + 2));


//LOGIC 2

        String[] firstLastName = splitted[1].split(" ");

        System.out.println("LOGIC 2: " + firstLastName[0].charAt(0) + "" + firstLastName[1].charAt(0));
    }
}

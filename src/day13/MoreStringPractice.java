package day13;

public class MoreStringPractice {

    public static void main(String[] args) {
        String name = "Denis";
        System.out.println(name);


        name.toUpperCase();       // not changed address of new String 1
        System.out.println(name); // not changed address of new String 2

        System.out.println(name.toUpperCase()); // not changed address of new String 3
        System.out.println(name); // not changed address of new String 4

        name=name.toUpperCase();// THIS IS REALLY CHANGES THE STRING PREVIOUS ADDRESS ARE GONE!!! 5

        System.out.println(name);


        System.out.println(name.startsWith("De")); //check String if start with...return true or false
        System.out.println(name.startsWith("de"));
        System.out.println(name.startsWith("DE"));

        System.out.println(name.endsWith("is")); //check String if end with...return true or false
        System.out.println(name.endsWith("iS"));
        System.out.println(name.endsWith("IS"));

    }
}

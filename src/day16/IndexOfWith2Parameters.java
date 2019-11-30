package day16;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {

        String name = "I love Java I Love Java Java Java";

        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java", 7)); //start searching from index 7
        System.out.println(name.indexOf("Java", 8)); //start searching from index 19
        System.out.println(name.indexOf("Java", 9)); //start searching from index 19
        System.out.println(name.indexOf("Java", 19)); //start searching from index 19
        System.out.println(name.indexOf("Java", 20)); //start searching from index 24

        int firstJavaLocation = name.indexOf("Java"); //location of first java
        int startingPointToSearchSecondJava = firstJavaLocation + 1; //version 1 to start search second Java
        // +word.length()  WE CAN USE THIS COMMAND TO SKIP FIRST JAVA

        int secondJavaLocation = name.indexOf("Java", startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);
        int startingPointToSearchThirdJava = secondJavaLocation + 1;

        int thirdJavaLocation = name.indexOf("Java", startingPointToSearchThirdJava);
        int secondSpace = name.indexOf(" ", firstJavaLocation + 1);
        System.out.println("thirdJavaLocation = " + thirdJavaLocation);
        System.out.println("second word in this sentence is " + name.substring(firstJavaLocation + 1, secondJavaLocation));

        //int firstSpaceLocation = name.indexOf(" ");
        //int secondSpace = name.indexOf(" ", firstSpaceLocation + 1);

        //System.out.println("Second word in this sentence is "
        //       + name.substring(firstSpaceLocation + 1, secondSpace));


    }
}
